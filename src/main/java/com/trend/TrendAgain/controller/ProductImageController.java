package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.ProductImage;
import com.trend.TrendAgain.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productImages")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    @PostMapping("/add")
    public ResponseEntity<ProductImage> insertProductImage(@RequestBody ProductImage productImage) {
        return new ResponseEntity<>(productImageService.addProductImage(productImage), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductImage>> getAllProductImages() {
        return new ResponseEntity<>(productImageService.getAllProductImages(), HttpStatus.OK);
    }

    @GetMapping("/getByProduct")
    public ResponseEntity<List<ProductImage>> getProductImagesByProduct(@RequestParam int productId) {
        return new ResponseEntity<>(productImageService.getProductImagesByProduct(productId), HttpStatus.OK);
    }
}
