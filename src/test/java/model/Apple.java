package model;

import model.constants.Color;
import model.constants.Discount;

public class Apple extends Food {
    public static String color = Color.red;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }


}
