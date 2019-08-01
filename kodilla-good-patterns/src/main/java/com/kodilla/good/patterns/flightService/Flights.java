package com.kodilla.good.patterns.flightService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flights {

    Map<Integer, Flight> flights = new HashMap<>();

    public void flightsBase() {
        flights.put(0, new Flight("Poznań", "Berlin", "direct flight"));
        flights.put (1, new Flight("Warzszawa", "Paryż", "Berlin"));
    }
     public Map<Integer, Flight> getFligts() {
        return flights;
     }

}
