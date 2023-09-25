package com.company;

public class Main {

    public static int sum (int... nums)
    {
        int sum=0;

        for (int i = 0; i < nums.length; i++)
        {
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sum(10,20,30,40,50,60,70,80,90,100));
        System.out.println(sum(1,1,1,1,1,1));
        System.out.println(sum(10,10,10,10,10));

    }
}
