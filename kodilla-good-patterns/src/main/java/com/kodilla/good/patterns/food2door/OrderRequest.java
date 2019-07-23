package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private User user;
    private Product product;
    private int productQuantity;
    private Deliverer deliverer;
    private ProducerInterface producerInterface;

    public OrderRequest(User user, Product product, int productQuantity, Deliverer deliverer, ProducerInterface producerInterface) {
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
        this.deliverer = deliverer;
        this.producerInterface = producerInterface;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public ProducerInterface getProducerInterface() {
        return producerInterface;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }
}
