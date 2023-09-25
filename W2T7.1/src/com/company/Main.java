package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 7.1
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        switch (text)
        {
            case "university":
                System.out.println("Diploma");
                break;
            case "academy":
                System.out.println("Certificate");
                break;
            case "csharp":
                System.out.println("ASP.NET Core");
                break;
            case "java":
                System.out.println("Spring Boot");
                break;
            case "php":
                System.out.println("Laravel Framework");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
