package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++)
        {
            arr[i]=random.nextInt()
        }

        //int[] arr = {1,12,3,3,3,3,3,3,3,1,1,3,3,3,3};
        int foundNums = 0;
        int max = 0;
        for (int i = 0; i< arr.length; i++)
        {
            if(arr[i]==3)
            {
                foundNums += 1; // Increment here
/*                for (int j = i+1; j<arr.length && arr[j] == 3; j++)
                {
                    foundNums++;
                }*/
                if (max < foundNums)
                {
                    max = foundNums;
                }
            }
            else
            {
                foundNums = 0; // Reset value.
            }
        }

        for (int i = 0; i < max; i++)
        {
            System.out.print("3, ");
        }
    }
}
