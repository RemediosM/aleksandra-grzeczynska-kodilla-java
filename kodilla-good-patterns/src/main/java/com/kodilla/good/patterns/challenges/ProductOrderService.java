package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime dateTime) {

        System.out.println("User name: " + user.getSurname() + " " + user.getName() + " date of order: " + dateTime.toString());

        return true;
    }
}
