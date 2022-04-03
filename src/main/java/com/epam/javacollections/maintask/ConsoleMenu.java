package com.epam.javacollections.maintask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    static List<Track> list = new ArrayList<>();

    static void defaultCondition() {
        System.out.println("What do you want?");
        System.out.println("1. Show all tracks;");
        System.out.println("2. Add new track;");
        System.out.println("3. Show tracks in define length;");
        System.out.println("4. Get length of all tracks;");
        System.out.println("5. Sort tracks of his styles;");
        System.out.println("6. Exit");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1: show(); break;
            case 2: add(); break;
            case 3: showDefLength(); break;
            case 4: lengthOfAllTracks(); break;
            case 5: sortList(); break;
            case 6: break;
        }
    }

    static void show() {
        System.out.println(list);
    }

    static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the track: ");
        String name = scanner.nextLine();
        System.out.println("Now enter the length in seconds: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Now enter the genre: ");
        String genre = scanner.nextLine();
        System.out.println("Now enter the author: ");
        String author = scanner.nextLine();
        Track track = new Track(length, name, genre, author);
        list.add(track);
        System.out.println("Good!");
        scanner.nextLine();
        defaultCondition();
    }

    static void showDefLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first length in seconds: ");
        int a = scanner.nextInt();
        System.out.println("Now enter the second length in seconds: ");
        int b = scanner.nextInt();
        System.out.println(TrackMethods.listOfNeedlesslyLarge(list, a, b));
        scanner.nextLine();
        System.out.flush();
        defaultCondition();
    }

    static void lengthOfAllTracks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of all tracks is: " + TrackMethods.tracksLength(list));
        scanner.nextLine();
        System.out.flush();
        defaultCondition();
    }

    static void sortList() {
        Scanner scanner = new Scanner(System.in);
        TrackMethods.StyleSort(list);
        System.out.println("Sorted!");
        scanner.nextLine();
        System.out.flush();
        defaultCondition();
    }

    public static void main(String[] args) {
        defaultCondition();
    }
}
