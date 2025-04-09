package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.Transaction;
import com.trend.TrendAgain.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/add")
    public ResponseEntity<Transaction> insertTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.addTransaction(transaction), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        return new ResponseEntity<>(transactionService.getAllTransactions(), HttpStatus.OK);
    }

    @GetMapping("/getByBuyer")
    public ResponseEntity<List<Transaction>> getTransactionsByBuyer(@RequestParam int buyerId) {
        return new ResponseEntity<>(transactionService.getTransactionsByBuyer(buyerId), HttpStatus.OK);
    }
}
