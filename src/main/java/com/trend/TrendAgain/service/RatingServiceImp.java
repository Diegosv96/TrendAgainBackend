package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Rating;
import com.trend.TrendAgain.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImp implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByProduct(int productId) {
        return ratingRepository.findByProductId(productId);
    }

    @Override
    public List<Rating> getRatingsByUser(int userId) {
        return ratingRepository.findByUserId(userId);
    }
}
