package com.company;
import java.util.Random;
//import.java.util.Arrays;

public class Main {

public static int generateRandomNumber(int min, int max) {
    Random random = new Random();
    int num = random.nextInt(max+1);

    if (min <= num)  {

        System.out.println(num);

    }


    else {
        generateRandomNumber(min, max);
    }
    return num;
}

public static void main(String[] args) {

    int min = 5;
    int max = 20;

    generateRandomNumber(5555000, 5555005);


}

}