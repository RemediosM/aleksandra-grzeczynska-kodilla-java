package com.kodilla.good.patterns.flightService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private Flights flights;

    public static void searchFrom(String from, Flights flights) {
        flights.getFligts().entrySet().stream()
                .filter(map -> map.getValue().getFlightFrom().equals(from))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void searchTo(String to, Flights flights) {
        flights.getFligts().entrySet().stream()
                .filter(map -> map.getValue().getFlightTo().equals(to))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void searchTransfer(String from, String to, String through, Flights flights) {
        flights.getFligts().entrySet().stream()
                .filter(map -> map.getValue().getFlightFrom().equals(from))
                .filter(map -> map.getValue().getFlightTo().equals(to))
                .filter(map -> map.getValue().getFlightThrough().equals(through))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
