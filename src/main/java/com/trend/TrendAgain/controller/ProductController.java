package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.Product;
import com.trend.TrendAgain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> insertProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/getByCategory")
    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam int categoryId) {
        return new ResponseEntity<>(productService.getProductsByCategory(categoryId), HttpStatus.OK);
    }

    @GetMapping("/getById")
    public ResponseEntity<Product> getProductById(@RequestParam int productId) {
        return new ResponseEntity<>(productService.getById(productId),HttpStatus.OK);
    }
}
