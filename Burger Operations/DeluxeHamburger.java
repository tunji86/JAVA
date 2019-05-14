package com.OlatunjiOjuko;

public class DeluxeHamburger extends HamburgerBasic {
    private boolean chips;
    private boolean drinks;

    private double chipsPrice = 1.00;
    private double drinksPrice = 1.00;

    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void setAdditionalPrices(double lettuce, double tomato, double carrot, double mustard) {
        super.setAdditionalPrices(lettuce, tomato, carrot, mustard);
    }

    public double addChipsAndDrinks(){

        double additionalCharges = chipsPrice + drinksPrice;
        System.out.println("Chips, $"+chipsPrice+", and drinks, $"+drinksPrice+", added to your menu");
        return additionalCharges;

    }

    //@Override
    public void hamburgerCost() {
        super.hamburgerCost(false, false, false, false);
       // addChipsAndDrinks();
        double finalDeluxePrice =  finalPrice + addChipsAndDrinks();
        System.out.println("Total order Price is now $"+finalDeluxePrice);
    }

    @Override
    public void priceList() {
        super.priceList();
        System.out.println("Chips is $"+chipsPrice+"\n"+"Drinks is $"+drinksPrice+"\n");
    }
}
