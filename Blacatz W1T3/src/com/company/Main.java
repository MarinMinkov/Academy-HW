package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task3
        Scanner scanner = new Scanner(System.in);
        String strOne, strTwo;
        int numOne, numTwo;
        System.out.println("Input string one:");
        strOne=scanner.next();
        System.out.println("Input string two: ");
        strTwo=scanner.next();
        System.out.println("Input integer one:");
        numOne=scanner.nextInt();
        System.out.println("Input integer tow: ");
        numTwo=scanner.nextInt();
        System.out.println(strOne+", " + strTwo + ", " + (numOne + numTwo));
    }
}
