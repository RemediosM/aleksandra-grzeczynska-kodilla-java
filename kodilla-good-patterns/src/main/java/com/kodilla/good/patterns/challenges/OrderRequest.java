package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime dateTime;
    private Product product;

    public OrderRequest(User user, LocalDateTime dateTime, Product product) {
        this.user = user;
        this.dateTime = dateTime;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Product getProduct() {
        return product;
    }
}
