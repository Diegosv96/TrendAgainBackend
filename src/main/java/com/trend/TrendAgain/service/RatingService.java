package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Rating;

import java.util.List;

public interface RatingService {
    Rating addRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingsByProduct(int productId);
    List<Rating> getRatingsByUser(int userId);
}
