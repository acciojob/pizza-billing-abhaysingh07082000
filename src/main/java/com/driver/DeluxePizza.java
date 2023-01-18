package com.driver;

public class DeluxePizza extends Pizza {


   private int dprice;

    public int getDprice() {
        return dprice;
    }

    public void setDprice(int dprice) {
        this.dprice = dprice;
    }

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg==true)
        {
            this.dprice=300;
        }else this.dprice=400;

//        addExtraCheese();
//        addExtraToppings();
//        addTakeaway();


    }





}
