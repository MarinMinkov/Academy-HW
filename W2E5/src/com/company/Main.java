package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num>50){
            System.out.println(">50");
        }
        else if(num==50){
        }
        else
        {
            System.out.println("<50");
        }
    }
}
