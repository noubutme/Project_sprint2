import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food apples = new Apple(10,50,"Красный");
        Food applesG = new Apple(8,60,"Зелёный");

        Food[] food = {meat,apples,applesG};
        ShoppingCart cart = new ShoppingCart(food);

        System.out.println(cart.price(10));
        System.out.println(cart.priceDicsount(10,60));
        System.out.println(cart.priceVegDicsount(10,60,true));
    }

}
