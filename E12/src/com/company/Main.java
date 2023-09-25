package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName,lName;
        int age;
        fName=scanner.nextLine();
        lName=scanner.nextLine();
        age=scanner.nextInt();
        System.out.println(fName+" "+lName+" will be "+(age+10)+" years old in 10 years.");
    }
}
