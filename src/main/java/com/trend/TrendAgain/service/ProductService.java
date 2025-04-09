package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(int categoryId);
}
