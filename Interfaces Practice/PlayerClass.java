package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.List;

public class PlayerClass implements ISaveable{
    private String playerName;
    private int age;
    private String country;


    public PlayerClass(String playerName, int age, String country) {
        this.playerName = playerName;
        this.age = age;
        this.country = country;
    }

    @Override
    public List<String> populate() {
        ArrayList<String> valuesList = new ArrayList<>();
        valuesList.add(0, this.playerName);
        valuesList.add(1,""+this.age);
        valuesList.add(2,this.country);
        return valuesList;
    }

    @Override
    public void retrieve(List<String> anyList) {
        if(anyList!= null && anyList.size()>0){
            this.playerName = anyList.get(0);
            this.age = Integer.parseInt(anyList.get(1));
            this.country = anyList.get(2);
        }

    }


    @Override
    public String toString() {
        return  "playerName -- " + playerName + '\'' +
                ", age -- " + age +
                ", country --" + country + '\'' +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
