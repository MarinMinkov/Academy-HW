package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 5
        Scanner scanner = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Input int a:");
        a=scanner.nextInt();
        System.out.println("Input int b:");
        b=scanner.nextInt();
        System.out.println("Input int c:");
        c=scanner.nextInt();
        max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println(max + " is the biggest number.");
    }
}
