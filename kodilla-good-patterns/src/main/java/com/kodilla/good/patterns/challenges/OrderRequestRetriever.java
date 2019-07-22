package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Smith");
        Product product = new Product("Notebook");
        LocalDateTime dateTime = LocalDateTime.of(2019,7,22,12,0);

        return new OrderRequest(user,dateTime, product);
    }
}
