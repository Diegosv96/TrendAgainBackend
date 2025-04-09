package com.trend.TrendAgain.repository;

import com.trend.TrendAgain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByBuyerId(int buyerId);
    List<Transaction> findByProductId(int productId);
}
