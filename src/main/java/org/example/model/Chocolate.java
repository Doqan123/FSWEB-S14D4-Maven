package org.example.model;

public class Chocolate extends ProductForSale{

    private double cocoaRate;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }


    @Override
    public void showDetails() {
        System.out.println("Cocoa Rate: " + this.cocoaRate +  "Price: " + getPrice() + "Decsription: " + getDescription() + "Type: " + getType());
    }


}
