package com.company;

import java.util.Random;
//import java.io.Console;
//import.java.util.Arrays;

public class Main {

public static int getMaxNumber(int[] arr) {


    int maxNum = 0;

    for (int i = 0; i < arr.length - 1; i++) {

        if (arr[i] < arr[i + 1]) {

            maxNum = arr[i + 1];

        } else {
            maxNum = arr[i];

            continue;
        }

    }

    return maxNum;
}

public static void main(String[] args) {

    int[] arr = {28, 1, 26};
    int maxNum = getMaxNumber(arr);
    System.out.println(maxNum);

}
}