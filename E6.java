/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Calendar;
import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        int currentAge = 0;
        int retirementAge = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = scan.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = scan.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeftToRetirement = retirementAge - currentAge;
        if (yearsLeftToRetirement >= 0) {

            int retirementYear = currentYear + yearsLeftToRetirement;
            System.out.println("You have " + yearsLeftToRetirement + " years left until you can retire.");
            System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
        } else {
            System.out.println("You can already retire");

        }
    }
}