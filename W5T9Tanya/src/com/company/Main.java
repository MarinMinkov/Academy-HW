package com.company;
//import java.util.Random;
//import java.io.Console;
//import.java.util.Arrays;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

public static void getAverage(int n) {

    double sum = 0;

    Scanner input = new Scanner(System.in);

    if (n > 0) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];


        }
        double res = sum / n;
        System.out.print(res);

    }
    else {
        System.out.println("Choose number bigger than 0");

    }
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    getAverage( n);
}
}
