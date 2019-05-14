package com.OlatunjiOjuko;

public class Main {

    public static void main(String[] args) {
        HamburgerBasic hamBurger1 = new HamburgerBasic("White Bread","Beef",3);
        hamBurger1.setAdditionalPrices(0.80,0.90,0.60,1.10);
        hamBurger1.hamburgerCost(true, false,true,true);
        System.out.println("***PRICE LIST***");
        hamBurger1.priceList();
        System.out.println("*******************************************************************");
        HealthyHamburger healthyhamburger1 = new HealthyHamburger("Schwein",3.20,true, false);
        healthyhamburger1.setAdditionalPrices(0.80,0.90,0.60,1.10);
        healthyhamburger1.hamburgerCost(true,true,false,false);
        System.out.println("***PRICE LIST***");
        healthyhamburger1.priceList();
        System.out.println("********************************************************************");
        DeluxeHamburger deluxeHamburger1 = new DeluxeHamburger("Thick white bread","Bacon",5.50);
        deluxeHamburger1.setAdditionalPrices(0.80,0.90,0.60,1.10);
        deluxeHamburger1.hamburgerCost();
        System.out.println("***PRICE LIST***");
        deluxeHamburger1.priceList();
    }
}
