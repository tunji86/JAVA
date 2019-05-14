package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.List;

public class GameClass implements ISaveable{
    private String name;
    private int points;


    public GameClass(String name, int points) {
        this.name = name;
        this.points = points;
    }


    @Override
    public List<String> populate() {
        List<String> valuesList = new ArrayList<>();
        valuesList.add(this.name);
        valuesList.add(""+this.points);
        return valuesList;
    }

    @Override
    public void retrieve(List<String> anyList) {
        if(anyList != null && anyList.size()>0){
            this.name = anyList.get(0);
            this.points = Integer.parseInt(anyList.get(1));//Integer.parseInt converts int value to String

        }


    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "GameClass{" +
                "name=" + name +
                ", points=" + points +
                '}';
    }
}
