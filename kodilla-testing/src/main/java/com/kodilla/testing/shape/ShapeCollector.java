package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    Shape shape;
    int n;

    List<Shape> shapesList = new ArrayList<>();



    public void addFigure(Shape shape){
        System.out.println();
    }

    public void removeFigure(Shape shape){

    }

    public void getFigure(Integer n){

    }

    public void showFigures(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        if (n != that.n) return false;
        if (!shape.equals(that.shape)) return false;
        if (!shapesList.equals(that.shapesList)) return false;
        return shape.equals(that.shape);
    }

    @Override
    public int hashCode() {
        int result = shape.hashCode();
        result = 31 * result + n;
        result = 31 * result + shapesList.hashCode();
        result = 31 * result + shape.hashCode();
        return result;
    }
}

