package com.OlatunjiOjuko;

import java.util.*;


public class Album {
    Song defaultSong = new Song("Default song",0.00);
    AlbumSong albumSongObject1 = new AlbumSong("Default ALbum",defaultSong);
    Album albumObject = new Album();
    Album.SongList songListObject = albumObject.new SongList();


    public boolean addPlaylistSong(LinkedList<String> anyList, String songName){
        ListIterator<String> myListIterator = anyList.listIterator();

        if (songListObject.findSongs(anyList,songName)){
            myListIterator.add(songName);
            System.out.println(songName+" has been added to play list");
            return true;
        }
        return false;
    }

    public static boolean checkPlaylistSong (LinkedList<String> anyList, String songName){
        ListIterator<String> myListIterator = anyList.listIterator();

        while(myListIterator.hasNext()){
            int testString = myListIterator.next().compareTo(songName);
            if(testString == 0){
               return true;
            }
        }
        return false;
    }


    public void skipForward(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        boolean forward = true;

        if(!forward){
            if(myListIterator.hasNext()){
                myListIterator.next();
            }
        }if(myListIterator.hasNext()){
            System.out.println("Next song is "+myListIterator.next());
        }else{
            System.out.println("You have reached end of the list");
        }
    }

    public void skipBackward(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        boolean forward = true;

        if(forward){
            if(myListIterator.hasPrevious()){
                myListIterator.previous();
                }
        }if(myListIterator.hasPrevious()){
            System.out.println("Previous song is "+myListIterator.previous());
        }else{
            System.out.println("You are at the top of the list");
        }
    }

    public void replay(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        boolean forward = true;

        if(!forward){
            if(myListIterator.hasNext()){
                System.out.println(myListIterator.next()+" is now playing");
            }
        }else if(forward){
            if(myListIterator.hasPrevious()){
                System.out.println(myListIterator.previous()+" is now playing");

            }
        }
    }

    public static boolean removePlaylistSong(LinkedList<String> anyList, String songName){
        ListIterator<String> myListIterator = anyList.listIterator();

        while(myListIterator.hasNext()){
            int testString = myListIterator.next().compareTo(songName);
            if(testString == 0){
                myListIterator.remove();
                System.out.println(songName+" has been removed from playlist.");
                if(myListIterator.hasNext()){
                    myListIterator.next();
                }   else if(myListIterator.hasPrevious()){
                    myListIterator.previous();
                }
                return true;

            }else{
                System.out.println(songName+" does not exist on the list.");
            }
        }return false;
    }

    public void printPlaylist(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        for(int i=0; i<anyList.size();i++){
            while(myListIterator.hasNext())
            System.out.println("Song "+i+1+": "+myListIterator.next());
        }
    }




    public class SongList{
        ArrayList<Song> albums = new ArrayList<>();

        //ADD SONGS(Song name and Duration TO ALBUM..ALBUM NAME NOT BEEN SAVED
        public void addAlbum(Song album, String albumName){

            albums.add(album);
            System.out.println(albumName+" has been added to list of albums");

        }
        //SEARCH ALBUMS IF SONG EXISTS IN IT
        public int checkSongs(String songName) {
            for (int i = 0; i < albums.size(); i++) {
                Song SongObject = albums.get(i);
                if (SongObject.getTitle().equals(songName)) {
                    return i;
                }
            }
            return -1;

        }

        //CHECK PLAYLIST IF SONG EXISTS IN IT
        public boolean findSongs (LinkedList<String> anyList, String songName){
            int checkSongExists = checkSongs(songName);

            if(checkSongExists<0){
                System.out.println(songName+" does not exist in any album");
                return false;
            }else if(checkPlaylistSong(anyList,songName) == true){
                System.out.println(songName+" exists in playlist already.");
                return false;
            }
            return true;

        }




        public ArrayList<Song> getAlbums() {
            return albums;
        }
    }
}
