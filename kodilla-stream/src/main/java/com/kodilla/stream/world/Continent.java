package com.kodilla.stream.world;

import java.util.List;

public class Continent {

    List<String> europeCountries;
    List<String> africaCountries;
    List<String> australiaCountries;
    List<String> asiaCountries;

    public List<String> getEuropeCountries() {
        europeCountries.add("Polska");
        europeCountries.add("Niemcy");
        europeCountries.add("Holandia");
        europeCountries.add("Irlandia");
        return europeCountries;
    }

    public List<String> getAfricaCountries() {
        africaCountries.add("Kongo");
        africaCountries.add("Tunezja");
        africaCountries.add("Algieria");
        africaCountries.add("Nigeria");
        return africaCountries;
    }

    public List<String> getAustraliaCountries() {
        australiaCountries.add("Nowa Zelandia");
        australiaCountries.add("Nauru");
        australiaCountries.add("Papua-Nowa Gwinea");
        australiaCountries.add("Palau");
        return australiaCountries;
    }

    public List<String> getAsiaCountries() {
        asiaCountries.add("Afganistan");
        asiaCountries.add("Bangadesz");
        asiaCountries.add("Pakistan");
        asiaCountries.add("Kambodza");
       return asiaCountries;
    }

}
