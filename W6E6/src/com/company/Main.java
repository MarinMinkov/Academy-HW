package com.company;

import java.util.Scanner;

public class Main {

    public static int sum(String str)
    {
        String []strArr = str.split(",");
        //int[] numArr = new int[strArr.length];
        int sum = 0;
        for (int i = 0; i < strArr.length; i++)
        {
           // numArr[i]= Integer.parseInt(strArr[i]);
            sum += Integer.parseInt(strArr[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sum(str));

    }
}
