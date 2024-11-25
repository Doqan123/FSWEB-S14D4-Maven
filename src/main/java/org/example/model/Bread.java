package org.example.model;

public class Bread extends ProductForSale{
    private String doughType;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Dough Type : " + this.doughType +  "Price: " + getPrice() + "Decsription: " + getDescription() + "Type: " + getType());
    }
}
