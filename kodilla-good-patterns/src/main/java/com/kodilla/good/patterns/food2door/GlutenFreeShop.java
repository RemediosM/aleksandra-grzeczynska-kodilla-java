package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements ProducerInterface {
    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Gluten Free Shop realizes the order.");

        return true;
    }
}
