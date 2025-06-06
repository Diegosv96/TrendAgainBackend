package com.trend.TrendAgain.repository;

import com.trend.TrendAgain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryId(int categoryId);
    Product findById(int id);
}
