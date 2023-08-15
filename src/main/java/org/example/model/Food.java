package org.example.model;

public abstract  class Food {
    public int amount;
    public double price;
    public boolean isVegetarian;

    public Food(int amount,double price){
        this.amount = amount;
        this.price = price;
    }
    protected void setVegetarian(){
        this.isVegetarian = true;
    }
}
