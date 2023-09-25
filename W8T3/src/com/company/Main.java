package com.company;

public class Main {

    public static void ascendingBubbleSort(int []arr){
        int temp;
        int num = arr.length;
        for (int i = 0; i < ( num - 1 ); i++)
        {
            for (int j = 0; j < num - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    public static void descendingBubbleSort(int []arr){
        int temp;
        int num = arr.length;
        for (int i = 0; i < ( num - 1 ); i++)
        {
            for (int j = 0; j < num - i - 1; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }

    public static int [] addToArray(int [] arr, int num)
    {
        int [] temp = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++)
        {
            temp[i]=arr[i];
        }

        temp[temp.length - 1]=num;
        return temp;
    }

    public static int [] specialArraySort (int [] arr)
    {
        int [] odd = new int[0];
        int [] even = new int[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]%2==0)
            {
                even = addToArray(even,arr[i]);
            }
            else
            {
                odd=addToArray(odd,arr[i]);
            }
        }
        // Има несъответствие между условието и примерните изходни данни.
        // Може да резменим сортирането за да получим резултат като примера.
        ascendingBubbleSort(odd);
        descendingBubbleSort(even);

        for (int i = 0, j = 0; i< arr.length; i++)
        {
            if (i< even.length)
            {
                arr[i]=even[i];
            }
            else
            {
                arr[i]=odd[j];
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int [] arrOne = {7, 9, 2, 3, 1, 4, 5, 6};
        int [] arrTwo = {20,25,21,27,37,9,1,13,15};

        int [] newArrOne = specialArraySort(arrOne);
        int [] newArrTwo = specialArraySort(arrTwo);

        for (int n: newArrOne)
        {
            System.out.print(n + ", ");
        }

        System.out.println();
        for (int n: newArrTwo)
        {
            System.out.print(n + ", ");
        }

    }
}
