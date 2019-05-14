package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class Game{
    private String playerName;
    private String score;
    ArrayList<Game> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public Game(String playerName, String score) {
        this.playerName = playerName;
        this.score = score;
    }



    public static Game gameConstructor (String goodGuy, String badGuy){
        return new Game(goodGuy, badGuy);
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getScore() {
        return score;
    }
}
