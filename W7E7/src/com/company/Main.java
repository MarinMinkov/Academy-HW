package com.company;

public class Main {

    public static String replace (String text)
    {
        String tempStr = "";
        tempStr = text.substring(4) + text.substring(1,4) + text.substring(0,1);
        text = tempStr;
        return text;
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println(replace(str));

    }
}
