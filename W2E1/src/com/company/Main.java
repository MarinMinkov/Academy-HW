package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\"" + name + "\"");
        System.out.format("\"%s\"",name);
        System.out.printf("\"%s\"%n",name);

       // System.out.println("\"%s\"",name);
    }
}
