package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("when create numbersList with numbers, " +
            "then method exterminate returns even"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbersList = new ArrayList<>();

        for (int i=1; i<200;i++){
            numbersList.add(i);
        }
        //When
        OddNumbersExterminator extermination = new OddNumbersExterminator();

        //Then

            System.out.println(extermination.exterminate(numbersList));

    }

    @DisplayName("when create empty numbersList, " +
            "then method exterminate returns empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbersList = new ArrayList<>();


        //When
        OddNumbersExterminator extermination = new OddNumbersExterminator();

        //Then

        System.out.println(extermination.exterminate(numbersList));

    }
}


