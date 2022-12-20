package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian = true;
    @Override
    public double getDiscount(){
        return Discount;
    }
    protected Food(int amount, double price, boolean isVegetarian){
        this.amount=amount;
        this.price=price;
        this.isVegetarian=isVegetarian;
    }
}
