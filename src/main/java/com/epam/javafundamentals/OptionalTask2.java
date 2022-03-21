package com.epam.javafundamentals;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {


    public static void main(String[] args) {
        System.out.println("Enter the count of numbers in your random matrix: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Now enter the bound of random numbers: ");
        int bound = scanner.nextInt();
        int[][] matrix = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                matrix[j][i] = new Random().nextInt(bound) * (new Random().nextInt(2) == 0 ? (1) : (-1));
            }

        }

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < count; i++) {
                System.out.print("[" + matrix[i][j] + "] ");
                if (i == count - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
}
