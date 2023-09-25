package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 7
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        if (text.contentEquals("university"))
        {
            System.out.println("Diploma");
        }
        else if (text.contentEquals("academy"))
        {
            System.out.println("Certificate");
        }
        else if (text.contentEquals("csharp"))
        {
            System.out.println("ASP.NET Core");
        }
        else if (text.contentEquals("java"))
        {
            System.out.println("Spring Boot");
        }
        else if (text.contentEquals("php"))
        {
            System.out.println("Laravel Framework");
        }
        else
        {
            System.out.println("Error");
        }
    }
    }
