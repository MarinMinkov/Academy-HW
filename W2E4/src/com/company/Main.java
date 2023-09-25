package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        text = scanner.nextLine();
        /*
        if (text.contains("A")){
        System.out.println("True");
        }
        else System.out.println("False");
        */
        System.out.println(text.contains("A"));
    }
}
