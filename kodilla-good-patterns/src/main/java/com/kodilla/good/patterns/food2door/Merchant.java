package com.kodilla.good.patterns.food2door;

public class Merchant {

    private String merchantName;

    public Merchant(String merchantName) {
        this.merchantName = merchantName;
    }

    @Override
    public String toString() {
        return "Merchant: " +
                merchantName;
    }
}
