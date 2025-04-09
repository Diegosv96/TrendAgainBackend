package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.Favorite;
import com.trend.TrendAgain.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("/add")
    public ResponseEntity<Favorite> insertFavorite(@RequestBody Favorite favorite) {
        return new ResponseEntity<>(favoriteService.addFavorite(favorite), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Favorite>> getAllFavorites() {
        return new ResponseEntity<>(favoriteService.getAllFavorites(), HttpStatus.OK);
    }

    @GetMapping("/getByUser")
    public ResponseEntity<List<Favorite>> getFavoritesByUser(@RequestParam int userId) {
        return new ResponseEntity<>(favoriteService.getFavoritesByUser(userId), HttpStatus.OK);
    }
}
