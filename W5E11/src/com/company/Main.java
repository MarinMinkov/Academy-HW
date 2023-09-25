package com.company;

public class Main {

public static int power (int num, int pow)
{
    int res = num;
    for (int i = 1; i<pow; i++)
    {
        res *= num;
    }

    return res;
}

public static void main(String[] args) {

    System.out.println(power(5,3) );

}
}
