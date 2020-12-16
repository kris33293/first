package com.kodilla.good.patterns.challenges;

public class Food2Door {

    public void process(OrderRequest orderRequest) {
        System.out.println("Zamowienie od " + orderRequest.getName());
        System.out.println("Typ Zamowienia " + orderRequest.getType());
        System.out.println("Wielkosc zamowienia " + orderRequest.getAmmount() + " sztuk");
        System.out.println("Zamowienie przebieglo pomyslnie");
        System.out.println();
    }


}

class Application {

    public static void main(String[] args) {

        Supplier extraFoodShop = new Supplier("ExtraFoodShop");
        Supplier healthyShop = new Supplier("HealthyShop");
        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");

        OrderRequest eFS = new OrderRequest(extraFoodShop, "batony", 1000);
        OrderRequest hS = new OrderRequest(healthyShop, "salatki", 250);
        OrderRequest gFS = new OrderRequest(glutenFreeShop, "ciastka", 550);

        Food2Door makeOrder = new Food2Door();

        makeOrder.process(eFS);
        makeOrder.process(hS);
        makeOrder.process(gFS);


    }

}

