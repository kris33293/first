package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    int field;

    @Override
    public String getShapeName(String name){
        return name;
    }

    @Override
    public Integer getField(int field){
        return field;
    }

}
