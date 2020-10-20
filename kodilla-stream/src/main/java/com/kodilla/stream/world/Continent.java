package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    public String name;

    public Continent(String name) {
        this.name = name;
    }


    List<Country> countries = new ArrayList<>();
    public void addCountry(Country name){
        countries.add(name);
    }

    public List<Country> getCountries() {
       return countries;
    }

}
