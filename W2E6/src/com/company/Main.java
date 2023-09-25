package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //E6
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if(name.length()==0){
            System.out.println("Error no input!");
        }
        else if(name.length()>6){
            System.out.println("Name is too long");
        }
        else{
            System.out.println("Name is ok");
        }




    }
}
