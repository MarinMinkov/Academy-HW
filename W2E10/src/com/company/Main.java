package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0&&!(year%100==0)||year%400==0){
            System.out.println("Visokosna");
        }
        else {
            System.out.println("Ne e visokosna");
        }
    }
}
