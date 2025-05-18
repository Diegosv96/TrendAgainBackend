package com.trend.TrendAgain.repository;

import com.trend.TrendAgain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByEmail(String email);
    User findByUsername(String username);
}
