package com.company;
//import java.util.Random;
//import java.io.Console;

import java.util.Arrays;

import java.util.Scanner;


public class Main {

public static int totalSum(String input, int[] prices) {

    String[] arr = input.split(",");
    int sum = 0;

    for (int i = 0; i < arr.length; i += 2) {

        int quantity = Integer.parseInt(arr[i + 1]);
        int index = Integer.parseInt(arr[i]);

        sum += quantity * prices[index];
    }
    return sum;
}

public static void main(String[] args) {

    String products[] = {"Salmon", "Rice", "Pasta", "Butter", "Milk", "Eggs", "Honey"};
    int prices[] = {10, 1, 1, 5, 3, 2, 10};
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(totalSum(input, prices));
}
}
