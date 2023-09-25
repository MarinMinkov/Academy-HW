package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 1;
        for (int i = 1; i <= 10; i++)
        {
            //System.out.println(Math.pow(2,i));
            for (int j=1;j < i; j++)
            {
                sum = sum * sum;
            }
            System.out.println(sum);
        }

    }
}
