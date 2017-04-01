package com.hjshah2.musicrec;



public class Song {
    public int id;
    public String name;
    public String author;
    public String year;
    public String time;
    public String genre;

    Song(){
        id = 0;
    }

    @Override
    public String toString() {
        return name + " " + author + " " + year + " " + time;
    }
}
