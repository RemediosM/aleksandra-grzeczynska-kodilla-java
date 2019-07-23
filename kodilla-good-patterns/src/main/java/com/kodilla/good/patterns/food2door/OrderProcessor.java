package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    OrderRequest orderRequest;

    public OrderProcessor(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public boolean process() {
        if(orderRequest.getProducerInterface().process(orderRequest)){
            System.out.println(orderRequest.getUser() + "\n" + orderRequest.getProduct() + "\nQuantity of product: " + orderRequest.getProductQuantity()
                                + "\n" + orderRequest.getDeliverer() + "\nThe order has been successfully completed.");
            return true;
        }else {
            System.out.println("The order failed.");
            return false;
        }
    }
}
