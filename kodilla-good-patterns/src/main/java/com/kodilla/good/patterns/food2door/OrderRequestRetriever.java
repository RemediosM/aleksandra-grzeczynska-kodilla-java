package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Merchant merchant = new Merchant("Lidl");
        Product product = new Product("yoghurt");
        int productQuantity = 1000;

        return new OrderRequest(merchant, product, productQuantity, new ExtraFoodShop());
    }
}
