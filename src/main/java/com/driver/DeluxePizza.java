package com.driver;

public class DeluxePizza extends Pizza {



    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here


        this.addTakeaway();
        this.addExtraCheese();
        this.addExtraToppings();


    }

      public int getPrice()
      {
          return 300;
      }

}
