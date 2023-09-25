package com.company;

public class Main {

    public static int[] reverseArray (int [] arr)
    {
        int [] resArr=new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            resArr[arr.length -1 - i]= arr[i];
        }

        return resArr;
    }
    public static void reverseSwap (int [] arr)
    {
        int temp;
        for (int i = 0; i < arr.length/2; i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length - 1 - i];
            arr[arr.length - 1 - i]=temp;
        }
        //for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--)
        {

        }



    }

    public static void main(String[] args) {

        int[] arr= {5,4,6,7,22};
        //int[] newArr = reverseArray(arr);

        reverseSwap(arr);


        for (int n: arr
             )
        {
            System.out.print(n + " ");
        }





    }
}
