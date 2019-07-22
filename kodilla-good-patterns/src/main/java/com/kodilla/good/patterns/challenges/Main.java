package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        MovieStore movieStore = new MovieStore();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailSender(), new ProductOrderService(), new ProductOrderRepository());

        orderProcessor.process(orderRequest);

//        String moviesTitles = movieStore.getMovies().entrySet().stream()
//                .flatMap(movie -> movie.getValue().stream())
//                .collect(Collectors.joining("!", "",""));
//
//        System.out.println(moviesTitles);
    }
}
