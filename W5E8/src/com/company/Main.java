package com.company;

import java.util.Scanner;

public class Main {

    public static void printInfo(int age, String name)
    {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your are: ");
        int age = scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.next();

        printInfo(age,name);


    }
}
