package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private Supplier name;
    private String type;
    private Integer ammount;

    public OrderRequest(final Supplier name, final String type, final Integer ammount) {
        this.name = name;
        this.type = type;
        this.ammount = ammount;

    }

    public Supplier getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAmmount() {
        return ammount;
    }
}
