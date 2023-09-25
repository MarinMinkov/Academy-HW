package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 6
        Scanner scanner = new Scanner(System.in);
        String folderName = scanner.nextLine();
        System.out.printf("C:\\Users\\%s\\AppData", folderName);
    }
    }
