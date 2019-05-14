package com.OlatunjiOjuko;

public class HamburgerBasic {
    protected String breadRollType;
    private String meat;
    protected double price;
    protected double finalPrice;

    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double mustardPrice;

    public void setAdditionalPrices (double lettuce, double tomato, double carrot, double mustard){
        this.lettucePrice = lettuce;
        this.tomatoPrice = tomato;
        this.carrotPrice = carrot;
        this.mustardPrice = mustard;

        //System.out.println("You have added ");
    }


    public HamburgerBasic(String breadRollType,String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }
    /*public void item1(double item1Price, String item2Name){
    //System.out.println("");
    this.item1Name = item1Name;
    this.item1Price = item1Price;
    }
     */

    /*
     */

    public double hamburgerCost(boolean lettuce, boolean tomatoes, boolean carrot, boolean mustard) {
        //double basePrice = 3.00;

        finalPrice = price;
        //if (item1Name != Null){
        //
        //}

        if (lettuce == true) {
            finalPrice += lettucePrice;
        }
        if (tomatoes == true) {
            finalPrice += tomatoPrice;
        }
        if (carrot == true) {
            finalPrice += carrotPrice;
        }
        if (mustard == true) {
            finalPrice += mustardPrice;
        }

        System.out.println("Your bread type is " + breadRollType +", meat is "+ meat+". Price of Basic Hamburger is $" + finalPrice);

        return finalPrice;

    }

    public void priceList(){
        System.out.println("Basic burger price is $"+price+"\n"+"Lettuce is  $"+lettucePrice+"\n"+"Tomato is $"+tomatoPrice+"\n"
        +"Carrot is $"+carrotPrice+"\n"+"Mustard is $"+mustardPrice+"\n");
    }



    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        //price = price +hamburgerCost();
        return price;
    }

}
