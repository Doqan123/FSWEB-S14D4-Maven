package org.example.model;

public class Coke extends ProductForSale{
    private double sugarRate;

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Sugar Rate: " + this.sugarRate +  "Price: " + getPrice() + "Decsription: " + getDescription() + "Type: " + getType());
    }

}
