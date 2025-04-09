package com.trend.TrendAgain.repository;

import com.trend.TrendAgain.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
    List<Favorite> findByUserId(int userId);
    List<Favorite> findByProductId(int productId);
}
