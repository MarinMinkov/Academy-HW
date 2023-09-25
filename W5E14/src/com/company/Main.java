package com.company;

public class Main {

    public static int sum(int[]arr)
    {
        int res=0;
        for (int i = 0; i < arr.length; i++)
        {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arrOne = {4,2,56,66,1,23};
        int[] arrTwo = {1,9,2,8,3,7,4,6,5,5,1,9,2,8,3,7,4,6,5,5,1,9,2,8,3,7,4,6,5,5};

        System.out.println(sum(arrOne));
        System.out.println( sum(arrTwo));


    }
}
