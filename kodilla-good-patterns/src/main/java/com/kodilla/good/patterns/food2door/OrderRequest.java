package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private Merchant merchant;
    private Product product;
    private int productQuantity;
    private ProducerInterface producerInterface;

    public OrderRequest(Merchant merchant, Product product, int productQuantity, ProducerInterface producerInterface) {
        this.merchant = merchant;
        this.product = product;
        this.productQuantity = productQuantity;
        this.producerInterface = producerInterface;
    }

    public Merchant getMerchant() {
        return merchant;
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
}
