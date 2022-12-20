package model.constants;

import model.Apple;
import model.Discountable;
import model.Food;

public class Discount implements Discountable {
    private static int redDiscount = 60;


    @Override
    public double getDiscount() {
        if (Apple.color.equals(Color.red)){
        return 60;
    }else return 0;

}}
