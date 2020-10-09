package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when create numbersList with numbers, " +
            "then method exterminate returns even"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> checkNumbersList = new ArrayList<>();

        for (int i = 1; i < 200; i++) {
            numbersList.add(i);
        }
        //When
        OddNumbersExterminator extermination = new OddNumbersExterminator();

        for (Integer number : numbersList) {
            if (number % 2 == 0) {
                checkNumbersList.add(number);
            }
        }
            //Then


            Assertions.assertEquals(extermination.exterminate(numbersList), checkNumbersList);

        }

        @DisplayName("when create empty numbersList, " +
                "then method exterminate returns empty list"
        )
        @Test
        void testOddNumbersExterminatorEmptyList() {
            //Given
            List<Integer> numbersList = new ArrayList<>();
            List<Integer> checkNumbersList = new ArrayList<>();


            //When
            OddNumbersExterminator extermination = new OddNumbersExterminator();

            //Then

            Assertions.assertEquals(extermination.exterminate(numbersList), checkNumbersList);

        }
    }


