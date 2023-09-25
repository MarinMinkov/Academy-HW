package com.company;

import java.util.Scanner;

public class Main {

    public static void increaseNumberVoid (int num, int increase)
    {
        System.out.println(num+increase);
    }

    public static int increaseNumberInt (int num, int increase)
    {
        return num + increase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int increase = scanner.nextInt();
        increaseNumberVoid(num,increase);
        num = increaseNumberInt(num,increase);
        System.out.println(num);

    }
}
