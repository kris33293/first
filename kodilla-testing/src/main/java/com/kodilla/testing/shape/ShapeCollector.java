package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapesList = new ArrayList<>();


    public int getFiguresQuantity () {
        return shapesList.size();
    }
    public void addFigure(Shape shape){

    }

    public  boolean removeFigure(Shape shape){
        return true;
    }

    public Shape getFigure(Integer n){
        return null;
    }

    public ArrayList<Shape> showFigures(){
        return null;
    }


}

