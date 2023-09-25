package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("Обърнат ред:");

        for (int i = array.length - 1; i >=0 ; i--)
        {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        for (int i=0;i<array.length; i++)
        {
            System.out.print(array[array.length-1-i] + " ");
        }
    }
}
