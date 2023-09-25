package com.company;

public class Main {

    public static int getMaxNumber (int[]arr)
    {
        int res=0;
        for (int i = 1; i< arr.length; i++)
        {
            res=Math.max(arr[i-1],arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arrOne = { 5, 1, 26 };
        System.out.println(getMaxNumber(arrOne));
        int[] arrTwo = { -2, -16, -5 };
        System.out.println(getMaxNumber(arrTwo));
    }
}
