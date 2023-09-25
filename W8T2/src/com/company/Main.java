package com.company;
public class Main {

    public static int [] arrayChange (int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]%5==0)
            {
                arr[i]+=i;
            }
            else
            {
                arr[i]+=findLastDigit(arr[i]);
            }
        }

        return arr;
    }

    public static int findLastDigit (int num)
    {
        int res = 0;
        String number;
        number = String.valueOf(num);
        res = Integer.parseInt(number.substring(number.length()-1));
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {10, 21, 15, 20};
        int [] newArr = arrayChange(arr);

        for (int n: newArr)
        {
            System.out.println(n);
        }

    }
}
