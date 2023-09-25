package com.company;

public class Main {

    public static int binarySearch(int [] arr, int num)
    {
        int mid = arr.length/2;
        int res = 0;

        if (num == arr[mid])
        {
            return mid;
        }
        else if (num < arr[mid] && num >arr[0])
        {
            res = binarySearch(arr, num, findNewMidStart(arr, num, mid) );
        }
        else if (num > arr[mid] && num < arr[arr.length-1])
        {
            res = binarySearch(arr, num, findNewMidEnd(arr, num, mid) );
        }
        else
        {
            res = -1;
        }

        return res;

    }

    public static int binarySearch(int [] arr, int num, int newMid)
    {

        if (num == arr[newMid])
        {
            return newMid;
        }
        else if (num < arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearch(arr, num, findNewMidStart(arr, num, newMid));
            }
        }
        else if (num > arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearch(arr, num, findNewMidStart(arr, num, newMid));
            }
        }

        return -1;
    }
    public static int findNewMidStart(int [] arr, int num, int mid)
    {
        int newMid;
        if (mid > arr.length / 2)
        {
            newMid = mid - ((arr.length - mid) / 2);

        }
        else
        {
            newMid = mid / 2;
        }
        return newMid;
    }
    public static int findNewMidEnd(int [] arr, int num, int mid)
        {
            int newMid = 0;
            if (mid > arr.length / 2)
            {
                newMid = ((arr.length - mid) / 2) + mid;
            }
            else
            {
                newMid = mid + (mid / 2);
            }
            return newMid;
        }

/*    public static int binarySearchEnd(int [] arr, int num, int mid)
    {
        int newMid = 0;
        if (mid>arr.length/2)
        {
            newMid = ((arr.length - mid) / 2) + mid;
        }
        else
        {
            newMid = mid + (mid/2);
        }

        if (num == arr[newMid])
        {
            return newMid;
        }
        else if (num < arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearchStart(arr, num, newMid);
            }
        }
        else if (num > arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearchEnd(arr, num, newMid);
            }
        }

        return -1;
    }

    public static int binarySearchStart(int [] arr, int num, int mid)
    {
        int newMid;
        if (mid>arr.length/2)
        {
            newMid = mid - ((arr.length - mid) / 2);

        }
        else
        {
            newMid = mid/2;
        }
        if (num == arr[newMid])
        {
            return newMid;
        }
        else if (num < arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearchStart(arr, num, newMid);
            }
        }
        else if (num > arr[newMid])
        {
            if (num == arr[newMid - 1])
            {
                return newMid - 1;
            }
            else if (num == arr[newMid + 1])
            {
                return newMid + 1;
            }
            else
            {
                return binarySearchEnd(arr, num, newMid);
            }
        }

        return -1;
    }*/

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(numbers, 15));

    }
}
