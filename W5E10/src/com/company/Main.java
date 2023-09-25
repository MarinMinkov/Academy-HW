package com.company;

public class Main {

    public static int arraySum (int [] arr)
    {
        int res = 0;

        for (int n : arr)
        {
            res += n;
        }

        return res;
    }

    public static void main(String[] args) {

        int [] arr = {5,2,1,4,5};
        System.out.println(arraySum(arr) );

    }
}
