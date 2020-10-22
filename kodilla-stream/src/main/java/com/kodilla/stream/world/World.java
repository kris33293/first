package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();


    public BigDecimal getPeopleQuantity(){
        BigDecimal total = getContinents().stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(Country::getPopulation)
                //     .forEach(System.out::println)
                .reduce(BigDecimal.ZERO, (sum, population) -> sum= sum.add(population));

        return total;
    }




    public void addContinent(Continent name){
        continents.add(name);
    }

    public List<Continent> getContinents() {

        return continents;

    }



}
