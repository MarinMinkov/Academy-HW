package com.company;

import java.util.Scanner;

public class Main {

    public static int [] maxNumToArray (String nums, int [] maxNums)
    {
        String [] numsStrArray = nums.split(",");
        int [] numsIntArray = new int[numsStrArray.length];
        int [] res = new int[maxNums.length + 1];
        int biggestNumber = 0;

        for (int i = 0; i< numsStrArray.length; i++)
        {
            numsIntArray[i]=Integer.parseInt(numsStrArray[i]);
        }

        for (int i = 0; i < maxNums.length; i++)
        {
            res[i]=maxNums[i];
        }

        biggestNumber = numsIntArray[0];

        for (int i = 1; i < numsIntArray.length; i++)
        {
            biggestNumber = Math.max(biggestNumber,numsIntArray[i]);
        }

        res[res.length - 1] = biggestNumber;

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = "";
        int [] maxNums = new int[0];

        while (true)
        {
            nums = scanner.nextLine();
            if ( nums.equals("end") )
            {
                break;
            }
            else
            {
                maxNums = maxNumToArray(nums, maxNums);
            }
        }

        for (int i = 0; i < maxNums.length; i++)
        {
            System.out.println(maxNums[i]);
        }

    }
}
