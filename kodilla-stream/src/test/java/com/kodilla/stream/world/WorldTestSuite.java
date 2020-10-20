package com.kodilla.stream.world;

import com.kodilla.stream.portfolio.Board;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        Continent europe = new Continent("Eurpopa");
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(australia);
        world.addContinent(europe);

        Country poland = new Country("Polska", BigDecimal.valueOf(40000000));
        Country germany = new Country("Niemcy",BigDecimal.valueOf(30000000));
        Country holland = new Country("Holandia",BigDecimal.valueOf(10000000));
        Country ireland = new Country("Irlandia",BigDecimal.valueOf(4000000));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(holland);
        europe.addCountry(ireland);

        Country kongo = new Country("Kongo", BigDecimal.valueOf(4000000));
        Country tunisia = new Country("Tunezja",BigDecimal.valueOf(3000000));
        Country algieria = new Country("Algieria",BigDecimal.valueOf(1000000));
        Country nigeria = new Country("Nigeria",BigDecimal.valueOf(4000000));
        africa.addCountry(kongo);
        africa.addCountry(tunisia);
        africa.addCountry(algieria);
        africa.addCountry(nigeria);

        Country newZeland = new Country("Nowa Zelandia", BigDecimal.valueOf(4000000));
        Country nauru = new Country("Nauru",BigDecimal.valueOf(3000000));
        Country papua = new Country("Papua-Nowa Gwinea",BigDecimal.valueOf(1000000));
        Country palau = new Country("Palau",BigDecimal.valueOf(4000000));
        australia.addCountry(newZeland);
        australia.addCountry(nauru);
        australia.addCountry(papua);
        australia.addCountry(palau);

        Country afganistan = new Country("Afganistan", BigDecimal.valueOf(1000000));
        Country bangladesh = new Country("Bangladesz",BigDecimal.valueOf(1000000));
        Country pakistan = new Country("Pakistan",BigDecimal.valueOf(1000000));
        Country cambodia = new Country("Kambodza",BigDecimal.valueOf(1000000));
        asia.addCountry(afganistan);
        asia.addCountry(bangladesh);
        asia.addCountry(pakistan);
        asia.addCountry(cambodia);

        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        assertEquals(BigDecimal.valueOf(112000000), result);
    }
}
