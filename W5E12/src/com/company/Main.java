package com.company;

public class Main {

    public static int arrayMax (int [] arr)
    {
        int res = 0;

        for (int i:arr)
        {
            res=Integer.max(res,i);
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arrOne = {1,2,15,5,6};

        System.out.println(arrayMax(arrOne) );

    }
}
