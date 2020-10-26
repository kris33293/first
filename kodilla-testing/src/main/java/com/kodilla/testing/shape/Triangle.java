package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name;
    int field;

    public Triangle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName(String name) {
        return name;
    }

    @Override
    public Integer getField(int field) {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (field != triangle.field) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }
}
