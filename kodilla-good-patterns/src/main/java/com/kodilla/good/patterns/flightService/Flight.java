package com.kodilla.good.patterns.flightService;

import java.util.Objects;

public class Flight {

    private String flightFrom;
    private String flightTo;
    private String flightThrough;

    public Flight(String flightFrom, String flightTo, String flightThrough) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightThrough = flightThrough;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightThrough() {
        return flightThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;
        return getFlightThrough().equals(flight.getFlightThrough()) &&
                getFlightTo().equals(flight.getFlightTo()) &&
                getFlightFrom().equals(flight.getFlightFrom());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightFrom(),getFlightThrough(),getFlightTo());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", flightThrough='" + flightThrough + '\'' +
                '}';
    }
}
