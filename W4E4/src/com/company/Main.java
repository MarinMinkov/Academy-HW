package com.company;

public class Main {

    public static void main(String[] args) {

        String num="";
        int sum=0;
        for (int i = 0; i < 5; i++)
        {
            num +="2";
            System.out.println(num);
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
