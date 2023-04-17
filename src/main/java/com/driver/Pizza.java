package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese=false;
    private boolean extratopping=false;
    private boolean paperBag=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price=300;
            bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            bill="Base Price Of The Pizza: 400\n";
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==true)return;
            bill = bill + "Extra Cheese Added: 80\n";
            price += 80;
        extraCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extratopping==true)return;
        if(isVeg) {
            bill = bill + "Extra Toppings Added: 70\n";
            price += 70;
        }
        else {
            bill = bill + "Extra Toppings Added: 120\n";
            price += 120;
        }extratopping=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag)return;
        bill=bill+"Paperbag Added: 20\n";
        price+=20;
        paperBag=true;
    }

    public String getBill(){
        // your code goes here
        bill=bill+"Total Price: "+price+"\n";
        return this.bill;
    }
}
