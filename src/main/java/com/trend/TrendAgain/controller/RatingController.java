package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.Rating;
import com.trend.TrendAgain.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/add")
    public ResponseEntity<Rating> insertRating(@RequestBody Rating rating) {
        return new ResponseEntity<>(ratingService.addRating(rating), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Rating>> getAllRatings() {
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    @GetMapping("/getByProduct")
    public ResponseEntity<List<Rating>> getRatingsByProduct(@RequestParam int productId) {
        return new ResponseEntity<>(ratingService.getRatingsByProduct(productId), HttpStatus.OK);
    }
}
