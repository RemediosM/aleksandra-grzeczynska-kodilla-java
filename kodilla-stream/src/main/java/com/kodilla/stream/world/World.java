package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public BigDecimal getPeopleQuantity(){
        return  continentsList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public void addContinent(Continent continent) {
        continentsList.add(continent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof World)) return false;

        World world = (World) o;

        return continentsList.equals(world.continentsList);

    }

    @Override
    public int hashCode() {
        return continentsList.hashCode();
    }

}
