package com.company;

public class Main {

    public static int allCombinations() // as in the task all loops are from 1 to 35.
    {
        int counter = 0;

        for (int i = 1; i <= 35; i++)
        {
            for (int j = 1; j <= 35; j++)
            {
                for (int k = 1; k <= 35; k++)
                {
                    for (int l = 1; l <= 35; l++)
                    {
                        for (int m = 1; m <= 35; m++)
                        {
                            counter++;
                            //System.out.printf("%d,%d,%d,%d,%d%n",i,j,k,l,m);
                        }

                    }

                }

            }

        }

        return counter;
    }

    public static int combinations() // Method found online to avoid counting combinations of the same numbers.
    {
        int counter = 0;

        for (int i1 = 1; i1 <= 31; i1++)
        {
            for (int i2 = i1 + 1; i2 <= 32; i2++)
            {
                for (int i3 = i2 + 1; i3 <= 33; i3++)
                {
                    for (int i4 = i3 + 1; i4 <= 34; i4++)
                    {
                        for (int i5 = i4 + 1; i5 <= 35; i5++)
                        {
                                counter++;
                            //System.out.printf("%d,%d,%d,%d,%d%n",i1,i2,i3,i4,i5);
                        }

                    }

                }

            }

        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(combinations());
        System.out.println(allCombinations());

    }
}
