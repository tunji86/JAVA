package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Album albumObject = new Album();
    private static Scanner scanner = new Scanner(System.in);
    private static Song songObject = new Song("Default Song",0.00);
    private static AlbumSong albumSongObject = new AlbumSong("Default Album",songObject);
    static LinkedList<String> playList = new LinkedList<>();


    public static void main(String[] args) {

    mainMenu();


    }

    private static void printMenu(){
       System.out.println("Press 0 to see main menu."+"\n"+
               "Press 1 to add album or songs to album"+"\n"+
               "Press 2 to add a song to playlist."+"\n"+
               "Press 3 to print playlist."+"\n"+
               "Press 4 to skip playlist forward"+"\n"+
               "Press 5 to skip playlist backward"+"\n"+
               "Press 6 replay current song"+"\n"+
               "Press 7 remove a song from playlist"+"\n"+
               "Press 8 to turn of music player"+"\n"
       );
    }

    private static void printPlayList(){
    albumObject.printPlaylist(playList);
        System.out.println("Press 0 to see main menu.");
    }
    private static void skipForward(){
        albumObject.skipForward(playList);
        System.out.println("Press 0 to see main menu.");
    }
    private static void skipBackward(){
        albumObject.skipBackward(playList);
        System.out.println("Press 0 to see main menu.");
    }
    private static void replay(){
        albumObject.replay(playList);
        System.out.println("Press 0 to see main menu.");
    }
    private static void remove(){
        System.out.println("Enter song you wish to delete ");
        String songName = scanner.nextLine();
        albumObject.removePlaylistSong(playList,songName);
        System.out.println("Press 0 to see main menu.");
    }

    private static void addToALbum (){
    System.out.println("Enter Album name: ");
    String albumName = scanner.nextLine().toUpperCase();
    System.out.println("Enter song Name: ");
    String songName = scanner.nextLine().toUpperCase();
    System.out.println("Enter song duration: ");
    double songDuration = scanner.nextDouble();
    Song newSong = Song.songConstructor(songName,songDuration);
    albumSongObject.addSong(newSong);
    AlbumSong newAlbum = AlbumSong.albumSongConstructor(albumName, newSong);
    albumObject.addAlbum(newAlbum,albumName);
    System.out.println("Press 0 to see main menu.");
}

    private static void addToPlaylist(){
        System.out.println("Enter song name ");
        String songName = scanner.nextLine();
        albumObject.addPlaylistSong(playList,songName);
    }




    private static void mainMenu(){
        boolean quit = false;
        System.out.println("ENJOY YOUR MUSIC");
        printMenu();

        while(!quit){

            int action = scanner.nextInt();
            scanner.nextLine();


            switch(action){
                case 0:
                    printMenu();
                    break;
                case 1:
                    addToALbum();
                    break;
                case 2:
                    addToPlaylist();
                    break;

                case 3:
                    printPlayList();
                    break;

                case 4:
                    skipForward();
                    break;
                case 5:
                    skipBackward();
                    break;
                case 6:
                    replay();
                    break;
                case 7:
                    remove();
                    break;
                case 8:
                    quit = true;
                    break;

            }
        }
}






















}
