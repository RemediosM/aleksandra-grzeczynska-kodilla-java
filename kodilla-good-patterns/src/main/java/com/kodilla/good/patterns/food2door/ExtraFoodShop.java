package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements ProducerInterface {
    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Extra Food Shop realizes the order.");

        return true;
    }
}
