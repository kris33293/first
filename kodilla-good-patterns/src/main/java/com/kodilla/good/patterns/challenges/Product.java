package com.kodilla.good.patterns.challenges;

public class Product {

    private String name,description;
    private int price;

    public Product (final String name,
                    final String description,
                    final Integer price) {
        this.name = name;
        this.description = description;
        this. price = price;
    }

    @Override
    public String toString() {
        return "Product : " + description + ", Cena: " + price ;
    }
}
