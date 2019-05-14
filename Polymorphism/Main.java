package com.OlatunjiOjuko;


class Car{
    private String name;
    private int cylinderNum;
    private int wheels;
    private Boolean engine;

    public Car(String name, int cylinderNum) {
        this.name = name;
        this.cylinderNum = cylinderNum;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinderNum() {
        return cylinderNum;
    }

    public int getWheels() {
        return wheels;
    }

    public Boolean getEngine() {
        return engine;
    }

    public String startEngine(){
        return "Super Car engine started.";
    }

    public String accelerate(){
        return "Super Car accelerated";
    }
    public String brake(){
        return "Super Car brake applied";
    }
}

//SUB-CLASSES

class sedan extends Car{
    public sedan() {
        super("Sedan", 4);
    }

    @Override
    public String startEngine() {
        return "Sedan has been started";
    }

    @Override
    public String accelerate() {
        return "Sedan has been accelerated";
    }

    @Override
    public String brake() {
        return "Sedan has had brake applied";
    }
}

class pickUp extends Car{
    public pickUp() {
        super("Pick Up", 3);
    }

    @Override
    public String startEngine() {
        return "Pick Up engine has started.";
    }

    @Override
    public String accelerate() {
        return "Pick Up has accelerated.";
    }

    @Override
    public String brake() {
        return "Pick Up brake has been applied.";
    }
}

class sportsCar extends Car{
    public sportsCar() {
        super("Sports Car", 8);
    }

    @Override
    public String startEngine() {
        return "Sports Car engine is started.";
    }

    @Override
    public String accelerate() {
        return "Sports Car is accelerated.";
    }

    @Override
    public String brake() {
        return "Sports car brake is applied";
    }
}


public class Main {

    public static void main(String[] args) {
	for (int i=1; i<7; i++) {
        Car car = whichCar();
        System.out.println("Car called is " + car.getName() + "\n" + "The accelerate message is " + car.accelerate() + "\n"+" Cylinder number is "+car.getCylinderNum());
    }
    }


    public static Car whichCar(){
        int carNum = (int) (Math.random() * 3) +1;
        System.out.println("Random number generated is "+carNum);
        switch (carNum){
            case 1: return new sedan();
            case 2: return new pickUp();
            case 3: return new sportsCar();

        }
        return null;
    }


}
