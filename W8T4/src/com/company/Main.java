package com.company;

import java.util.Scanner;

public class Main {

public static int [] prices = {60,40,70};
public  static String [] beverages = {"coffee", "tea", "chocolate"};
public static int [] coins = {100,50,20,10,5,2,1};

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

    public static int price (String beverage)
    {
        int price = 0;
        beverage = beverage.toLowerCase();

        for (int i = 0; i < beverages.length; i++)
        {
            if (beverage.equals(beverages[i]))
            {
                price = prices[i];
            }
        }

        return price;
    }

    public static int [] calculateChange (int price, int credit)
    {
        int [] calculatedChange = new int[0];
        int totalChange = credit - price;
        
        for (int i = 0; i< coins.length; i++)
        {
            while (totalChange >= coins[i])
            {
                totalChange -= coins[i];
                calculatedChange = addToArray(calculatedChange, coins[i]);
            }
        }

        return calculatedChange;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a drink: Coffee, Tea, Chocolate");
        String beverage = scanner.nextLine();
        System.out.println("Insert credit:");
        int credit = scanner.nextInt();

        int [] change = calculateChange(price(beverage),credit);

        for (int i = 0; i < change.length; i++)
        {
            if (i == change.length-1)
            {
                System.out.print(change[i]);

            }
            else
            {
                System.out.print(change[i] + ", ");
            }
        }

    }
}
