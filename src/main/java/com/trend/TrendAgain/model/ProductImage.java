package com.trend.TrendAgain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product_images")
public class ProductImage {
    @Column(name = "image_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    @JsonBackReference
    private Product product;

    @Column(nullable = false)
    private String imageUrl;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public ProductImage(int id, Product product, String imageUrl, Date createdAt) {
        this.id = id;
        this.product = product;
        this.imageUrl = imageUrl;
        this.createdAt = (createdAt != null) ? createdAt : new Date();
    }

    public ProductImage() {
    }

    public int getImageId() {
        return id;
    }

    public void setImageId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
