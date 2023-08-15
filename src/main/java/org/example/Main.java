package org.example;

import org.example.model.Apple;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;
import org.example.model.Food;


public class Main {
    public static void main(String[] args){
        Food meat = new Meat(5,100);
        Food redApples = new Apple(10,50, Colour.RED);
        Food greenApples = new Apple(8,60, Colour.GREEN);

        Food[] items = {meat,redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Total price:" + cart.getTotalPrice());
        System.out.println("Total price discount:" + cart.getTotalPriceWithDiscount());
        System.out.println("Vegetarian total price not discount:" + cart.getVegetarianPrice());
    }
}