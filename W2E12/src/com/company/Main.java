package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        switch (num){
            case 2:
                System.out.println("Slab");
                break;
            case 3:
                System.out.println("sreden");
                break;
            case 4:
                System.out.println("dobar");
                break;
            case 5:
                System.out.println("mn. dobar");
                break;
            case 6:
                System.out.println("otlichen");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
