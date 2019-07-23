package com.kodilla.good.patterns.food2door;

public class HealthyShop implements ProducerInterface {
    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Healthy Shop realizes the order.");

        return true;
    }
}
