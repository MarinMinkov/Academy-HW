package com.company;

public class Main {

    public static int sum(int numOne, int numTwo)
    {
        int res=numOne+numTwo;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(8,0));
        System.out.println(sum(-5,5));
        System.out.println(sum(-26,-23));
    }
}
