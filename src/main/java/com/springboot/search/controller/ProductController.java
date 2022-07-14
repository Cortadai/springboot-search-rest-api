package com.springboot.search.controller;

import com.springboot.search.entity.Product;
import com.springboot.search.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search1")
    public ResponseEntity<List<Product>> searchProducts1(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProductsJPQL(query));
    }

    @GetMapping("/search2")
    public ResponseEntity<List<Product>> searchProducts2(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProductsSQL(query));
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

}
