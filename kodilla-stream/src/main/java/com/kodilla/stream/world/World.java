package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
        Continent peopleQuantity = null;
        BigDecimal total = BigDecimal.ZERO;
                peopleQuantity.countries.stream()
                .map(Country::getPopulation)
                        .reduce(total, (sum, current) -> sum= sum.add(current));
                return total;
    }

    public void addContinent(Continent name){
        continents.add(name);
    }

    public List<Continent> getContinents() {

        return continents;

    }



}
