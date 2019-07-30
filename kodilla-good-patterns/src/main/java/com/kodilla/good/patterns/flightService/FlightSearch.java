package com.kodilla.good.patterns.flightService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private Flights flights;

    public FlightSearch(Flights flights) {
        this.flights = flights;
    }

    public List<Flight> searchFlightFrom(String city) {
        List<Flight> flightFrom = flights.getFlights().stream()
                .filter(result -> result.getFlightFrom().equals(city))
                .collect(Collectors.toList());
        return flightFrom;
    }

    public List<Flight> searchFlightTo(String city) {
        List<Flight> flightTo = flights.getFlights().stream()
                .filter(result -> result.getFlightTo().equals(city))
                .collect(Collectors.toList());
        return flightTo;
    }

    public void showTheResults(String ask, String city) {
        if(ask.equals("To")){
            System.out.println(searchFlightTo(city));
        } else if(ask.equals("From")){
            System.out.println(searchFlightFrom(city));
        }
    }
}
