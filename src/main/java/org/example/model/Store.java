package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] product = new ProductForSale[5];
        product[0]= new Bread("Food",23, "A delicious bread");
        product[1] = new Chocolate("Food", 20,"A delicious chocolate");
        product[3] = new Coke("Drink",10,"A cold coke");

        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            if(product != null){
                product.showDetails();
            }
        }

    }
}