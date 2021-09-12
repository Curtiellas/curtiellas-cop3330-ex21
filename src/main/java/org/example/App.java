package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //String[] months = new String[12];
        final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println( "Please enter the number of the month: " );
        int choice = sc.nextInt();

        String selection = "[Invalid]";

        //switch case is redundant with array, but it is graded
        switch (choice)
        {
            case 1:
                selection = months[0];
                break;

            case 2:
                selection = months[1];
                break;

            case 3:
                selection = months[2];
                break;

            case 4:
                selection = months[3];
                break;

            case 5:
                selection = months[4];
                break;

            case 6:
                selection = months[5];
                break;

            case 7:
                selection = months[6];
                break;

            case 8:
                selection = months[7];
                break;

            case 9:
                selection = months[8];
                break;

            case 10:
                selection = months[9];
                break;

            case 11:
                selection = months[10];
                break;

            case 12:
                selection = months[11];
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.printf("The name of the month is %s.", selection);
    }
}
