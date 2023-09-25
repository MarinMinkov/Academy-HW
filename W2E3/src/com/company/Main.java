package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = "2022-02-13";
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8);
        String bgDate = String.format("%s/%s/%s",day,month,year);
        System.out.println(bgDate);
    }
}
