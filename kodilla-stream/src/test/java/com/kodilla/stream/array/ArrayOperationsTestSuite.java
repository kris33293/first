package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        //When
        Double average = ArrayOperations.getAverage(numbers);
        // Then
        assertEquals(2, average);

    }
}
