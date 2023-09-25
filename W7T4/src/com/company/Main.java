package com.company;
import java.util.Random;
public class Main {

    public static int[] findMatches (int[] arrA, int[] arrB)
    {
        int [] res;
        int [] tempArr = new int[100];
        int counter = 0;
        boolean isRepeated = false;
        for (int i = 0; i<arrA.length; i++)
        {
            for (int j = 0; j<arrB.length; j++)
            {
                if (arrA[i]==arrB[j])
                {
                    for (int k = 0; k < tempArr.length; k++) // To avoid adding repeat numbers.
                    {
                        if (tempArr[k]==0)
                        {
                            isRepeated = false;
                            break;
                        }
                        else if (tempArr[k]==arrA[i])
                        {
                            isRepeated = true;
                            break;
                        }
                    }
                    if (isRepeated == false)
                    {
                        tempArr[counter] = arrA[i];
                        counter++;
                    }
                }
            }
        }

        res = new int[counter];
        for (int i = 0; i < res.length; i++)
        {
            res[i]=tempArr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] arrA = new int[10];
        int [] arrB = new int[10];
        int [] arrC;

        for (int i = 0; i < 10; i++)
        {
            arrA[i] = random.nextInt(100) + 1;
            arrB[i] = random.nextInt(100) + 1;
        }
        /* //Test values from the example.
        arrA = new int[]{1,2,3,4,5,6,7,8,9,10};
        arrB = new int[]{10,20,30,40,50,60,70,80,90,1};
        */
        arrC = findMatches(arrA,arrB);
        for (int i : arrC)
        {
            System.out.print(i + " ");
        }

    }
}
