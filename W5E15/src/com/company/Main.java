package com.company;

public class Main {

    public static void combineAndLower (String[] stringArr)
    {
        String res = new String();
        for (int i = 0; i< stringArr.length; i++)
        {
            for (int j = 0; j < stringArr[i].length(); j++)
            {
                if (stringArr[i].charAt(j)>=65 && stringArr[i].charAt(j)<=90)
                {
                    char[]temp=stringArr[i].toCharArray();
                    temp[j] += 32;
                    stringArr[i] = String.valueOf(temp);
                }
            }
            res+= stringArr[i]+" ";
        }
        //res.toLowerCase();
        System.out.println(res);
    }

    public static void main(String[] args) {

        char []a ={'H','i','l','l','o'};
        for (int i=0;i< a.length;i++)
        {
            if (a[i]>=65 && a[i]<=90)
            {
                a[i] += 32;
            }
            System.out.println(a[i]);
        }
        a[0] = 66;
        String[] strArr = { "Hillo, Hillo", "My name is Kate", "And I'm a little Stupid"};
        combineAndLower(strArr);


    }
}
