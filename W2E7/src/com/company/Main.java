package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //E7
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch(num){
            case 2:
                System.out.println("Simple number");
                break;
            case 3:
                System.out.println("Simple number");
                break;
            case 5:
                System.out.println("Simple number");
                break;
            case 7:
                System.out.println("Simple number");
                break;
            default:
                System.out.println("The number is not simple");
        }
        if (num==2||num==3||num==5||num==7){
            System.out.println("Simple number");
        }
        else {
            System.out.println("The number is not simple");
        }
    }
}
