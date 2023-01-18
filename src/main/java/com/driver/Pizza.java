package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheezeprice;

    private int toppingprice;

    private int takeawayprice;

    boolean ischeezAdded;

    boolean istoppingAdded;

    boolean isTakeawayAdded;

    boolean isBillGenerated;
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        // your code goes here
        this.cheezeprice=80;
        this.takeawayprice=20;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
         this.isBillGenerated=false;
        if(this.isVeg==true)
        {
            this.price=300;
            this.toppingprice=70;
        }

        else
        {
            this.price=400;
            this.toppingprice=120;
        }

        this.ischeezAdded=false;
        this.isTakeawayAdded=false;

        this.istoppingAdded=false;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeezAdded==false)
        {
            this.price=this.price+this.cheezeprice;
            ischeezAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
     if(istoppingAdded==false)
     {
         this.price=this.price+this.toppingprice;
         istoppingAdded=true;
     }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeawayAdded==false)
        {
            this.price=this.price+this.takeawayprice;
            isTakeawayAdded=true;
        }
    }

    /*Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paperbag Added: 20
Total Price: 470*/

    public String getBill(){
        // your code goes here

        if(ischeezAdded==true)
              this.bill=this.bill+"Extra Cheese Added: "+this.cheezeprice+"\n";
        if(istoppingAdded==true)
              this.bill=this.bill+"Extra Toppings Added: "+this.toppingprice+"\n";
        if(isTakeawayAdded==true)
               this.bill=this.bill+"Paperbag Added: "+this.takeawayprice+"\n";

        this.bill=this.bill+"Total Price :"+this.price+"\n";
        isBillGenerated=true;

        return this.bill;
    }


}
