package com.epam.javacollections.maintask;

public class Track {
    String name;
    int trackLength;
    String genre;
    String author;

    public Track(int length, String name, String genre, String author) {
        this.trackLength = length;
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", trackLength=" + trackLength +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
