package com.company;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();


    int j = 0;
    while (j < text.length())
    {
        System.out.println(text.charAt(j));
        j++;

        for (int i = 0; i < j; i++) {

            System.out.printf(" ");

        }
    }
}}
