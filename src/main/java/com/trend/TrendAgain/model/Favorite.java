package com.trend.TrendAgain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Column(name = "favorite_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public Favorite(int id, User user, Product product, Date createdAt) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.createdAt = (createdAt != null) ? createdAt : new Date();
    }

    public Favorite(User user, Product product, Date createdAt) {
        this.user = user;
        this.product = product;
        this.createdAt = (createdAt != null) ? createdAt : new Date();
    }

    public Favorite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
