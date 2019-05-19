package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country eng = new Country("England", new BigDecimal("50000000"));
        Country pol = new Country("Poland", new BigDecimal("38000000"));
        Country chi = new Country("China", new BigDecimal("7000000000"));
        Country moz = new Country("Mozambique", new BigDecimal("500000"));
        Country usa = new Country("USA", new BigDecimal("1200000000"));
        Country can = new Country("Canada", new BigDecimal("800000000"));
        Country jap = new Country("England", new BigDecimal("4500000000"));
        Continent eu = new Continent("Europe");
        Continent as = new Continent("Asia");
        Continent am = new Continent("America");
        Continent af = new Continent("Africa");
        eu.addCountry(eng);
        eu.addCountry(pol);
        as.addCountry(chi);
        af.addCountry(moz);
        am.addCountry(usa);
        am.addCountry(can);
        as.addCountry(jap);
        World world = new World();
        world.addContinent(eu);
        world.addContinent(am);
        world.addContinent(af);
        world.addContinent(as);
        //When
        BigDecimal totalPopulation = BigDecimal.ZERO;
        for(Continent continent : world.getContinentsList()){
            for(Country country : continent.getCountryList()){
                totalPopulation = totalPopulation.add(country.getPeopleQuantity());
            }
        }

        //Then
        Assert.assertEquals(totalPopulation, world.getPeopleQuantity());

    }
}
