package com.example.nobs.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    // Dependency Injection
    @Autowired
    private CreateProductService createProductService;
    private GetProductService getProductService;
    private UpdateProductService updateProductService;
    private DeleteProductService deleteProductService;

    @PostMapping
    public ResponseEntity<String> createProduct() {
        return createProductService.execute();
    }

    @GetMapping
    public ResponseEntity<String> getProduct(){
        return getProductService.execute();
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute();
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute();
    }
}
