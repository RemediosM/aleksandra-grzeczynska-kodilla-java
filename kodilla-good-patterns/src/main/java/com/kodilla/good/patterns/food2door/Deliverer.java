package com.kodilla.good.patterns.food2door;

public class Deliverer {

    private String delivererName;

    public Deliverer(String delivererName) {
        this.delivererName = delivererName;
    }

    @Override
    public String toString() {
        return "Deliverer: " +
                delivererName;
    }
}
