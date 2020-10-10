package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name;
    int field;

    public Circle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName(String name){
        return name;
    }

    @Override
    public Integer getField(int field){
        return field;
    }

}
