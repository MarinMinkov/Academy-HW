package com.company;
import java.util.Random;
//import.java.util.Arrays;

public class Main {

public static int GenerateRandomNumber() {
    Random rand = new Random();
    int num1 = rand.nextInt(10);
    // int num2 = rand.nextInt(10);
    System.out.println(num1);

    //System.out.println(num2);
    return num1;
    //return num2;
    // System.out.println(GenerateRandomNumber());
}


public static int Sum() {

    int num1 = GenerateRandomNumber();


    int num2 = GenerateRandomNumber();

    return num1 + num2;


}

public static void main(String[] args) {


    int result = Sum();

    System.out.println(Sum());

    System.out.println(result);

}
}
