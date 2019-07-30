package com.kodilla.good.patterns.flightService;

public class FlightServiceApplication {

    public static void main(String[] args) {
        Flights flights = new Flights();
        FlightSearch flightSearch = new FlightSearch(flights);

        flightSearch.showTheResults("From", "Poznań");
    }
}
