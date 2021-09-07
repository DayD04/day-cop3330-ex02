package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the input string? " );
        String inputString = input.nextLine();
        int a = inputString.length();
        System.out.println(inputString + " has " + a + " characters.");
    }
}
