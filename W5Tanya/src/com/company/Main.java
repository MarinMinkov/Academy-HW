package com.company;
//import java.util.Random;
import java.util.Scanner;
//import.java.util.Arrays;

public class Main {

public static int Sum (int a, int b) {

    Scanner scanner = new Scanner(System.in);

    a = scanner.nextInt();
    System.out.println(a);
    return a+b;


}

public static void main(String[] args) {
    int result = Sum (-7, 8);


    System.out.println(result);

}
}
