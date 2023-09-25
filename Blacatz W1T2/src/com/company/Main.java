package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 2
        Scanner scanner = new Scanner(System.in);
        String FirstName;
        int age;
        System.out.println("Task 2");
        System.out.println("Input a name: ");
        FirstName=scanner.next();
        System.out.println("Input age: ");
        age= scanner.nextInt();
        System.out.println(FirstName+" is "+age+" Years old");
    }
}
