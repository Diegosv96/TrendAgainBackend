package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.ProductImage;

import java.util.List;

public interface ProductImageService {
    ProductImage addProductImage(ProductImage productImage);
    List<ProductImage> getAllProductImages();
    List<ProductImage> getProductImagesByProduct(int productId);
}
