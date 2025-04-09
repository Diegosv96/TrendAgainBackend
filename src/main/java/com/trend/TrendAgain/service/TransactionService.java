package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    List<Transaction> getTransactionsByBuyer(int buyerId);
    List<Transaction> getTransactionsByProduct(int productId);
}
