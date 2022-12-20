package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian = true;


    protected Food(int amount, double price, boolean isVegetarian){
        this.amount=amount;
        this.price=price;
        this.isVegetarian=isVegetarian;

    }
}
