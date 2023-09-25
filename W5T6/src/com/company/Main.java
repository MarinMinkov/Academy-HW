package com.company;

public class Main {

    public static void increaseArray(int[] arr, int increase)
    {
        for (int i = 0; i<arr.length;i++)
        {
            arr[i]+=increase;
            if (i<arr.length-1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }

        System.out.println();

    }
    public static void main(String[] args) {
        int[] arrOne = { 5, 1, 26 };
        increaseArray(arrOne,2);
        int[] arrTwo = { -2, -16, -5 };
        increaseArray(arrTwo,5);
    }
}
