package com.epam.javafundamentals;

import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        System.out.println("Input a count of necessary numbers: ");
        int count = new Scanner(System.in).nextInt();
        StringBuilder result  = new StringBuilder();
        for (int i = 0; i < count; i++) {
            double a = Math.random();
            System.out.println(a);
            result.append(a).append(" ");
        }
        System.out.println(result);
    }
}
