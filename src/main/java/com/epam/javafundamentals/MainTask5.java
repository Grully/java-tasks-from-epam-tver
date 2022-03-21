package com.epam.javafundamentals;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter the number of your month: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.matches("[0-9]+[\\.]?[0-9]*")) {
            int a = Integer.parseInt(s);
            if(a < 1 || a > 12) {
                System.out.println("Number is not correct");
            }
            else {
                System.out.println(months[a-1]);
            }
        }
        else {
            System.out.println("It is not number");
        }
    }
}
