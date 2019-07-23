package com.kodilla.good.patterns.food2door;

public class Product {
    private String product;

    public Product(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return
                "Ordered product: " + product;
    }
}
