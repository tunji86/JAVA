package com.OlatunjiOjuko;

import java.util.ArrayList;

public class AlbumSong {
    //THIS CLASS IS NOW REDUNDANT TO PROJECT
    private String album;
    private ArrayList<Song> songs = new ArrayList<>();

    public AlbumSong(String album, Song song) {
        this.album = album;


    }

    public void addSong(Song newSong){

        songs.add(newSong);
           }


    public int checkSongs(String songName) {
        for (int i = 0; i < songs.size(); i++) {
            Song albumSongObject = songs.get(i);
            if (albumSongObject.getTitle().equals(songName)) {
                return i;
            }
        }
        return -1;

    }

    //public static AlbumSong albumSongConstructor (String albumName){
      //  return new AlbumSong(albumName);
    //}

    public static AlbumSong albumSongConstructor(String albuName, Song newSong){
        return new AlbumSong(albuName,newSong);
    }



    public String getAlbum() {
        return album;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
}
