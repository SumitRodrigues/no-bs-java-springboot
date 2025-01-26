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

    @PostMapping
    public ResponseEntity<String> createProduct() {
        return createProductService.execute();
    }

    @GetMapping
    public ResponseEntity<String> getProduct(){
        return ResponseEntity.status(HttpStatus.OK).body("Got Product");
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return ResponseEntity.status(HttpStatus.OK).body("Product Updated");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product Deleted");
    }
}
