package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    User getUserByEmail(String email);
}
