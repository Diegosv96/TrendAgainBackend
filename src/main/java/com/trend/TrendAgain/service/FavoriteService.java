package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Favorite;

import java.util.List;

public interface FavoriteService {
    Favorite addFavorite(Favorite favorite);
    List<Favorite> getAllFavorites();
    List<Favorite> getFavoritesByUser(int userId);
}
