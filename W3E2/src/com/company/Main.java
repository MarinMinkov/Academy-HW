package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int i=0;
        while(i<numA)
        {
            i+=2;
            System.out.println(i);
        }
    }
}
