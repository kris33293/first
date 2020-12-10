package com.kodilla.good.patterns.challenges;

public class Buyer {
    private String name, address;


    public Buyer (final String name,
                    final String address) {
        this.name = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Buyer : " + name + " ,"  + address ;
    }
}
