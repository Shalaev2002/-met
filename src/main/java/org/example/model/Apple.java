package org.example.model;
import org.example.model.constants.Colour;
public class Apple extends Food implements Discountable{

    public Apple(int amount,double price,String colour){
        super(amount, price);
        setVegetarian();
        if (colour.equals(Colour.Red)){
            SetDiscount();
        }
    }
    private double discount;
    private void SetDiscount(){
        this.discount = 60;
    }
    @Override
    public double getDiscount(){
        return discount;
    }
}
