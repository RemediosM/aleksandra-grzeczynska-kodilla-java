package com.kodilla.good.patterns.challenges;

public class Product {
    private String product;

    public Product(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                '}';
    }
}
