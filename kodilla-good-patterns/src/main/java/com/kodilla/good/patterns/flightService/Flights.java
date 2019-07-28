package com.kodilla.good.patterns.flightService;

import java.util.ArrayList;
import java.util.List;

public class Flights {

    List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        flights.add(new Flight("Poznań", "Berlin", "direct flight"));
        flights.add(new Flight("Warzszawa", "Paryż", "Berlin"));
        return flights;
    }
}
