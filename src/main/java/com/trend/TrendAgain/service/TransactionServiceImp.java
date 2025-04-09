package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Transaction;
import com.trend.TrendAgain.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImp implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByBuyer(int buyerId) {
        return transactionRepository.findByBuyerId(buyerId);
    }

    @Override
    public List<Transaction> getTransactionsByProduct(int productId) {
        return transactionRepository.findByProductId(productId);
    }
}
