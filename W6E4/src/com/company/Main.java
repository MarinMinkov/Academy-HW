package com.company;

public class Main {

    public static boolean isPrime (int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i ==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(15));
        System.out.println(isPrime(11));
    }
}
