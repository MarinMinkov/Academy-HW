package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 4
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Input a:");
        a=scanner.nextDouble();
        System.out.println("Input b:");
        b=scanner.nextDouble();
        System.out.println("Input c:");
        c=scanner.nextDouble();
        System.out.println(Math.sqrt(a+b)+Math.pow(c,2));
    }
}
