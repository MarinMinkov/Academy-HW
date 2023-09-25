package com.company;

import java.util.Scanner;

public class Main
{

    public static String[] enDictionary = {"Word", "Book", "Sentence"};
    public static String[] bgDictionary = {"Duma", "Kniga", "Izrechenie"};

    public static int findTranslation(String input)
    {
        for (int i = 0; i < enDictionary.length; i++)
        {
            if (enDictionary[i].equals(input))
            {
                return i;
            }
            else if (bgDictionary[i].equals(input))
            {
                return i + 5;
            }
        }

        return -1;
    }

    public static String normalizeInput(String input)
    {
        input.toLowerCase();
        input = input.substring(0, 1).toUpperCase() + input.substring(1, input.length());
        return input;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String userInput = scanner.nextLine();

        userInput = normalizeInput(userInput);

        int translationIndex = findTranslation(userInput);

        if (translationIndex > -1 && translationIndex < 5)
        {
            System.out.println(bgDictionary[translationIndex]);
        }
        else if (translationIndex > 5)
        {
            System.out.println(enDictionary[translationIndex - 5]);
        }
        else
        {
            System.out.println("No translation available");
        }
    }
}
