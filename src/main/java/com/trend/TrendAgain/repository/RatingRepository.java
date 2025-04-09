package com.trend.TrendAgain.repository;

import com.trend.TrendAgain.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
    List<Rating> findByProductId(int productId);
    List<Rating> findByUserId(int userId);
}
