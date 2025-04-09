package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.ProductImage;
import com.trend.TrendAgain.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageServiceImp implements ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    @Override
    public ProductImage addProductImage(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    @Override
    public List<ProductImage> getAllProductImages() {
        return productImageRepository.findAll();
    }

    @Override
    public List<ProductImage> getProductImagesByProduct(int productId) {
        return productImageRepository.findByProductId(productId);
    }
}
