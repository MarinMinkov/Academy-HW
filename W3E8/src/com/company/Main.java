package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 1000)
        {
            if (i % 4 == 0 && i % 10 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
