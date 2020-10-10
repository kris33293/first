package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.*;

public class ShapeCollector {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("Test for circle")
    class TestCircle {
        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 25 );
            // When
            shapeCollector.

        }

        @Test
        void testRemoveFigure() {
            // do nothing
        }

        @Test
        void testGetFigure(int n) {

        }

        @Test
        void testShowFigures() {

        }

    }
}
