package com.epam.javafundamentals;

import java.util.Scanner;

public class MainTask1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Your name is: " + scanner.nextLine());
    }
}
