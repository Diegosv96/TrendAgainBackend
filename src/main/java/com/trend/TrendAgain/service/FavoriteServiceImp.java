package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Favorite;
import com.trend.TrendAgain.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImp implements FavoriteService {
    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Favorite addFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    @Override
    public List<Favorite> getAllFavorites() {
        return favoriteRepository.findAll();
    }

    @Override
    public List<Favorite> getFavoritesByUser(int userId) {
        return favoriteRepository.findByUserId(userId);
    }
}
