package com.company;

import java.util.Scanner;

public class Main {

    //public static void


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names: ");
        String names = scanner.nextLine();
        System.out.println("Enter Numbers for the names: ");
        String nums = scanner.nextLine();

        String[] namesArr = names.split(",");
        String[] numsArr = nums.split(",");

        for (int i = 0; i < namesArr.length; i++)
        {
            System.out.println(namesArr[i] + " " + numsArr[i]);
        }




    }
}
