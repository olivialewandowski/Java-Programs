/*
    This program was created on February 3rd, 2023 by Olivia Lewandowski. 
    This program calculates the future investment value given the user's input of investment amount, annual interest rate, and number of years. 
 */

import java.util.Scanner;
import java.lang.Math;

public class FutureInvestmentCalculator
{
    public static void main (String [] args)
    {
        //declarations
        double investmentAmount;
        double annualInterestRate;
        double annualInterestRateProportion;
        double numberOfYears;
        double futureInvestmentValue;
        Scanner kb = new Scanner(System.in);

        //input
        //prompt user input for the three variables
        System.out.println("Enter the investment amount: ");
        investmentAmount = kb.nextDouble();

        System.out.println("Enter the annual interest rate (ex. enter 4.5 for 4.5%): ");
        annualInterestRate = kb.nextDouble();
        annualInterestRateProportion = annualInterestRate / 100;

        System.out.println("Enter the number of years: ");
        numberOfYears = kb.nextDouble();

        //processing
        //calculate furture investment value using given formula
        futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRateProportion / 12)), (numberOfYears * 12));
    
        //output
        //display future investment value
        System.out.println("Your future investment value is: " + futureInvestmentValue);
    }
}
