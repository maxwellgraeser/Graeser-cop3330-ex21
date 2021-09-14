/*
 *  UCF COP3330 Fall 2021 Exercise 20 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class NumbersToNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month = scan.nextInt();
        String output;

        switch (month) {
            case 1:
                output = "The name of the month is January.";
                break;
            case 2:
                output = "The name of the month is February.";
                break;
            case 3:
                output = "The name of the month is March.";
                break;
            case 4:
                output = "The name of the month is April.";
                break;
            case 5:
                output = "The name of the month is May.";
                break;
            case 6:
                output = "The name of the month is June.";
                break;
            case 7:
                output = "The name of the month is July.";
                break;
            case 8:
                output = "The name of the month is August.";
                break;
            case 9:
                output = "The name of the month is September.";
                break;
            case 10:
                output = "The name of the month is October.";
                break;
            case 11:
                output = "The name of the month is November.";
                break;
            case 12:
                output = "The name of the month is December.";
                break;
            default:
                output = "Invalid input";
                break;
        }

        System.out.println(output);
    }
}