package com.OlatunjiOjuko;


    public class HealthyHamburger extends HamburgerBasic{
        private boolean garlic;
        private boolean onion;

        private double garlicPrice = 1.00;
        private double onionPrice = 0.50;

        public HealthyHamburger(String meat, double price, boolean garlic, boolean onion) {
            super("Brown rye bread", meat, price);
            this.garlic = garlic;
            this.onion = onion;
            //this.garlic = garlic;
            //this.onion = onion;
        }

        @Override
        public void setAdditionalPrices(double lettuce, double tomato, double carrot, double mustard) {
            super.setAdditionalPrices(lettuce, tomato, carrot, mustard);
        }

        public double additionalCost(){

            double addedCharge = 0;
            if(garlic == true){
                addedCharge += garlicPrice;
            }
            if (onion == true){
                addedCharge += onionPrice;
            }

            System.out.println("**** Added charge is "+addedCharge);
            return addedCharge;
        }

        @Override
        public double hamburgerCost(boolean lettuce, boolean tomatoes, boolean carrot, boolean mustard) {
            //additionalCost();
            super.hamburgerCost(lettuce, tomatoes, carrot, mustard);
            double finalHealthyBurgerPrice = finalPrice + additionalCost();
            System.out.println("Your total charge is "+finalHealthyBurgerPrice);


            return price;
        }

        @Override
        public void priceList() {
            super.priceList();
            System.out.println("Garlic is $"+garlicPrice+"\n"+"Onion is $"+onionPrice+"\n");
        }

        /*public void hamburgerCost (boolean lettuce, boolean tomatoes, boolean carrot, boolean mustard) {
            //double basePrice = 3.00;
            double lettucePrice = 1.50;
            double tomatoPrice = 1.70;
            double carrotPrice = 0.50;
            double mustardPrice = 0.40;
            double garlicPrice = 1.00;
            double onionPrice = 0.50;
            double finalPrice = price;

            if (lettuce == true){
                finalPrice += lettucePrice;
            }
            if (tomatoes == true){
                finalPrice += tomatoPrice;
            }
            if (carrot == true){
                finalPrice += carrotPrice;
            }
            if (mustard == true){
                finalPrice += mustardPrice;
            }
            if (garlic == true){
                finalPrice += garlicPrice;
            }
            if (onion == true){
                finalPrice += onionPrice;
            }
            System.out.println("Your bread type is "+breadRollType+". Hamburger price is "+finalPrice);

            //return finalPrice;

        }*/

    }
