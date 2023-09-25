package com.company;

import java.util.Scanner;

public class Main {

    public static void menu()
    {
        System.out.println("1. Show Products");
        System.out.println("2. Add Product");
        System.out.println("3. Edit Product");
        System.out.println("4. Delete Product");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
    }
}
