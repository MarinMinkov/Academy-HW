package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        int UserNum;
        System.out.println("Task 1");
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        UserNum=scanner.nextInt();
        System.out.println(UserNum+10);
    }
}
