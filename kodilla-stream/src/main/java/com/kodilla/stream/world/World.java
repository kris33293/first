package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
        continents.stream();

        return BigDecimal.ZERO;
    }

    public void addContinent(Continent name){
        continents.add(name);
    }

    public List<Continent> getContinents() {

        return continents;

    }



}
