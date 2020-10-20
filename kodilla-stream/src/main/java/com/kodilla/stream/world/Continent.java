package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    public String name;

    public Continent(String name) {
        this.name = name;
    }

    List<Country> europeCountries;
    List<Country> africaCountries;
    List<Country> australiaCountries;
    List<Country> asiaCountries;

    public void addEuropeCountry(Country name){
        europeCountries.add(name);
    }

    public List<Country> getEuropeCountries() {
        return europeCountries;
    }

    public List<Country> getAfricaCountries() {
        return africaCountries;
    }

    public List<Country> getAustraliaCountries() {
        return australiaCountries;
    }

    public List<Country> getAsiaCountries() {
       return asiaCountries;
    }

}
