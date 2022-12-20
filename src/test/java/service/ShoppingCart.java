package service;

import model.Food;

public class ShoppingCart {
       Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

//



    public double price(double price){
        double allPrice = 0;
        for (int i = 0; i < foods.length ; i++) {
            allPrice = allPrice + price;
        }
        return allPrice;
    }
    public double priceDicsount(double price, double discount){
        double allPrice = 0;
        for (int i = 0; i < foods.length ; i++) {
            allPrice +=price * (discount/100) ;
        }
        return allPrice;
    }
    public double priceVegDicsount(double price, double discount,boolean isVegetarian){
        double allPrice = 0;
        for (int i = 0; i < foods.length ; i++) {
            if (isVegetarian==true){
            allPrice +=price * (discount/100) ;
            }else continue;
        }
        return allPrice;
    }
}
