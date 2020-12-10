package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public void process(Buyer client, Product item){
        System.out.println("Zamowiony " + item);
        System.out.println(client);
        System.out.println();
    }
}

class Service {

    public static void main(String[] args) {

        ProductOrderService order = new ProductOrderService();

        Buyer client1 = new Buyer("user1","Akacjowa, Polska");
        Buyer client2 = new Buyer("user2","Strumykowa, Polska");

        Product item1 = new Product("Pralka", "Pralka Whirpool", 999);
        Product item2 = new Product("Buty", "Nike Air", 399);

        order.process(client1,item1);
        order.process(client2,item2);


    }
}