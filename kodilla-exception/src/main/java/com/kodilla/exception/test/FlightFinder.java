package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;
import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("SIN", true);
        flightsMap.put("YYU", false);
        flightsMap.put("LKO", true);
        flightsMap.put("LAN", false);


        if(flightsMap.containsKey(flight.getArrivalAirport())){
            if (flightsMap.get(flight.getArrivalAirport())){
                System.out.println("You can fly to this airport");
            } else {
                System.out.println("You can't fly to this airport");
            }
        } else {
            throw new RouteNotFoundException("There's no such airport");
        }

    }
}

