package com.company;
//import java.util.Random;
//import java.io.Console;
//import.java.util.Arrays;

import java.util.Scanner;


/*
public class Main {

public static boolean contains(String[] products, String prod) {

    boolean res = true;
    for (int i = 0; i < products.length; i++) {

        if (prod.equals(products[i])) {
            res = true;
            break;
        } else res = false;
    }
    return res;
}

public static void main(String[] args) {

    String products[] = {"Salmon", "Rice", "Pasta", "Butter", "Milk", "Eggs", "Honey"};
    String prod = "";
    Scanner scanner = new Scanner(System.in);

    while (true) {

        prod = scanner.nextLine();

        if (prod.equals("end")) {
            break;

        } else System.out.println(contains(products, prod));
    }
}
}*/

public class Main {

public static boolean contains(String[] products, String prod) {

    boolean res = false;

    for (int i = 0; i<products.length; i++)

        if (prod.equals(products[i])) {
            res = true; }
        else continue;
    return  res;
}

public static void main(String[] args) {

    String products[] = {"Salmon", "Rice", "Pasta", "Butter", "Milk", "Eggs", "Honey"};
    String prod = "";
    Scanner scanner = new Scanner(System.in);
    while (true) {

        prod = scanner.nextLine();

        if (prod.equals("end")) {
            break;

        } else System.out.println(contains(products, prod));
    }
}
}