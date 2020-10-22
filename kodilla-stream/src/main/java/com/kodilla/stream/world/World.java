package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();


    public BigDecimal getPeopleQuantity(){
        Continent continent = null;
        BigDecimal total = BigDecimal.ZERO;
                getContinents().stream()
                .flatMap(continents -> continents.getCountries().stream())
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
