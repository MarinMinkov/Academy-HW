package com.company;

public class Main {

    public static void main(String[] args) {
        String input = "2022/05/31";
        String [] splitInput = input.split("/");
        String formated = "";

        for (int i = splitInput.length-1; i >= 0; i--)
        {
            if (i != 0)
            {
                formated += splitInput[i] + "/";
            }
            else
            {
                formated += splitInput[i];
            }
        }
        System.out.println(formated);
    }
}
