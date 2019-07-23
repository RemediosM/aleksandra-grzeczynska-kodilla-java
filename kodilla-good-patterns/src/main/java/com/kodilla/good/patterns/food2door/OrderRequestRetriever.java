package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jhon", "Smith");
        Product product = new Product("yoghurt");
        int productQuantity = 10;
        Deliverer deliverer = new Deliverer("DHL");

        return new OrderRequest(user, product, productQuantity, deliverer, new ExtraFoodShop());
    }
}
