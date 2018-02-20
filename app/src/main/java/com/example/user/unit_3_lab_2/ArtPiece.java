package com.example.user.unit_3_lab_2;

/**
 * Created by User on 2/19/2018.
 */

public class ArtPiece {
    private String name;
    private String artist;
    private int year;

    public ArtPiece(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ArtPiece{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
