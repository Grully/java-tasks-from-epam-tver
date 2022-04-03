package com.epam.javacollections;

import java.util.Scanner;
import java.util.Stack;

public class OptionalTask2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
       Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }
        System.out.println(a);
    }


}
