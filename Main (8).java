/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    final int COVERAGE = 350;
    
    int length, width;
    double total_SqFt;
    double paint_Needed;
    int placeholder1;
    int placeholder2;

    Scanner in = new Scanner(System.in);

    System.out.print("Enter length: ");
    length = in.nextInt();

    System.out.print("Enter width: ");
    width = in.nextInt();

    total_SqFt = length * width;

    paint_Needed = total_SqFt / COVERAGE;

    paint_Needed = Math.ceil(paint_Needed);

    placeholder1 = (int) paint_Needed;
    placeholder2 = (int) total_SqFt;

    System.out.println("You will need to purchase " + placeholder1 + " gallons of paint to cover " + placeholder2 + " square feet.");
  }
}