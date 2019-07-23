package com.kodilla.good.patterns.food2door;

public class Food2DoorApp {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(orderRequest);

        orderProcessor.process();
    }
}
