package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
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
            Circle circle = new Circle("circle", 25);
            // When
            shapeCollector.addFigure(circle);
            // Then
            Assertions.assertEquals(1, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 25);
            // When
            boolean result = shapeCollector.removeFigure(circle);
            // Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testGetFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 25);
            shapeCollector.addFigure(circle);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            // Then
            Assertions.assertEquals(circle, retrievedShape);

        }

        @Test
        void testGetFigureNegativeIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(-1);
            // Then
            Assertions.assertNull(retrievedShape);

        }

        @Test
        void testGetFigureOverloadedIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(7);
            // Then
            Assertions.assertNull(retrievedShape);

        }
    }

    @Nested
    @DisplayName("Test for square")
    class TestSquare {


        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            // When
            shapeCollector.addFigure(square);
            // Then
            Assertions.assertEquals(1, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            // When
            boolean result = shapeCollector.removeFigure(square);
            // Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testGetFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            // Then
            Assertions.assertEquals(square, retrievedShape);

        }

        @Test
        void testGetFigureNegativeIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(-1);
            // Then
            Assertions.assertNull(retrievedShape);

        }

        @Test
        void testGetFigureOverloadedIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(7);
            // Then
            Assertions.assertNull(retrievedShape);

        }
    }

    @Nested
    @DisplayName("Test for triangle")
    class TestTriangle {


        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 25);
            // When
            shapeCollector.addFigure(triangle);
            // Then
            Assertions.assertEquals(1, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 25);
            // When
            boolean result = shapeCollector.removeFigure(triangle);
            // Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFiguresQuantity());


        }

        @Test
        void testGetFigure(int n) {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 25);
            shapeCollector.addFigure(triangle);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            // Then
            Assertions.assertEquals(triangle, retrievedShape);

        }

        @Test
        void testGetFigureNegativeIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(-1);
            // Then
            Assertions.assertNull(retrievedShape);

        }

        @Test
        void testGetFigureOverloadedIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 25);
            shapeCollector.addFigure(square);
            // When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(7);
            // Then
            Assertions.assertNull(retrievedShape);

        }
    }

    @Test
    void testShowFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 12);
        shapeCollector.addFigure(triangle);
        Square square = new Square("square", 25);
        shapeCollector.addFigure(square);
        Circle circle = new Circle("circle", 25);
        shapeCollector.addFigure(circle);
        // When
        List<Shape> retrievedShapes = new ArrayList<>();
        retrievedShapes.add(circle);
        retrievedShapes.add(square);
        retrievedShapes.add(triangle);
        // Then
        Assertions.assertEquals(retrievedShapes, shapeCollector.showFigures());

    }

}
