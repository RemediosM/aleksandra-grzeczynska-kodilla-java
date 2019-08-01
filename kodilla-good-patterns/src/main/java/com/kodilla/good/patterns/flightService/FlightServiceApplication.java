package com.kodilla.good.patterns.flightService;

public class FlightServiceApplication {

    public static void main(String[] args) {

        String from = "Warszawa";
        String to = "Paryż";
        String through = "Berlin";
        Flights flights = new Flights();

        flights.flightsBase();

        System.out.println("Flights from: " + from);
        FlightSearch.searchFrom(from, flights);
        System.out.println("\nFlights to: " + to);
        FlightSearch.searchTo(to, flights);
        System.out.println("\nFlights from: " + from + " to: " + to + " through: " + through);
        FlightSearch.searchThrough(from, to, through, flights);
    }

}

