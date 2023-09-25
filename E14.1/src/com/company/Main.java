package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        if(Name.length()>6){
            System.out.println("The name is too long");
        }
        else System.out.println("The name is suitable");
    }
}
