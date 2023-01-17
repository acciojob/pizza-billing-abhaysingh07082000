package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=300;
    }

    public void addExtraCheese(){
        // your code goes here
        price=price+80;
    }

    public void addExtraToppings(){
        // your code goes here
        price=price+70;
    }

    public void addTakeaway(){
        // your code goes here
        price=price+20;
    }

    public String getBill(){
        // your code goes here
        bill=String.valueOf(price);
        return this.bill;
    }
}
