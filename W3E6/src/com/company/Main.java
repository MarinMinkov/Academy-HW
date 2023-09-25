package com.company;

public class Main {

    public static void main(String[] args) {
        int numOne = 30;
        int numTwo = 15;
        int nod=0;
        int min = 0;
        min = Math.min(numOne,numTwo);
        for (int i = 1; i <= min; i++)
        {
            if(numOne % i == 0 && numTwo % i == 0)
            {
               nod=i;
            }
        }
        System.out.println(nod);
    }
}
