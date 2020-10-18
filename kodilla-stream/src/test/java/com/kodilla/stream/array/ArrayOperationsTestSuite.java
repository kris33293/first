package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1,5,6,2,5,4,3,5,6,8,9,0,6,7,5,3};
        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);
        // Then
        assertEquals(4.6875, average);

    }
}
