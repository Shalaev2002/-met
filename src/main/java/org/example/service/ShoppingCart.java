package org.example.service;
import org.example.model.Food;
import org.example.model.Discountable;

public class ShoppingCart {
    private final Food[] items;
    public ShoppingCart(Food[] items){
         this.items = items;
     }
     public double getTotalPrice(){
        double totalPrice = 0;
        for(Food item : items){
            totalPrice += item.amount * item.price;
        }
        return totalPrice;
     }
     public double getTotalPriceWithDiscount(){
        double totalPrice = 0;
        for(Food item : items){
            double price = item.amount * item.price;
            if(item instanceof Discountable){
                price *=(100-((Discountable)item).getDiscount()) / 100;
            }
            totalPrice += price;
        }
        return totalPrice;
     }
     public double getVegetarianPrice(){
        double vegetarianPrice = 0;
        for(Food item : items){
            if(item.isVegetarian){
                vegetarianPrice += item.amount * item.price;
            }
        }
        return vegetarianPrice;
     }
}
