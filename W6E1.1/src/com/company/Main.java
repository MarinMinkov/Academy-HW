package com.company;

import java.util.Scanner;

public class Main {

    public static String getFullName()
    {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String lName = scanner.nextLine();

        return fName + " " + lName;
    }

public static String getFullName(String fName, String lName)
{
    return fName + " " + lName;
}

    public static void main(String[] args) {
        System.out.println(getFullName());
        System.out.println(getFullName("Ivan","Petrov"));
    }
}
