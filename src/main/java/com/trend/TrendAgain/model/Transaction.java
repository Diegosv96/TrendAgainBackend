package com.trend.TrendAgain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Column(name = "transaction_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "buyer_id", nullable = false)
    private User buyer;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private double amount;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    public Transaction(int id, User buyer, Product product, double amount, Date transactionDate) {
        this.id = id;
        this.buyer = buyer;
        this.product = product;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public Transaction() {
    }

    public int getTransactionId() {
        return id;
    }

    public void setTransactionId(int id) {
        this.id = id;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
