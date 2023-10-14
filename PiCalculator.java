/*
    This program was created by Olivia Lewandowski on Feb 19 2023. 
    This program calculates the value of pi based on the value of i in the series. 
 */

import java.util.*;
import java.lang.Math;

public class PiCalculator 
{
    public static void main (String [] args)
    {
        //declarations
        int i;
        int n; 
        double seriesOutput = 0;
        double result;
        double pi;
    
        Scanner kb = new Scanner(System.in);

        //input - get user input for number of iterations/times
        System.out.println("Enter a value for i: ");
        n = kb.nextInt(); 

        //processing -  use for loop to iterate through the series n times - follow pi formula
        for(i = 1; i <= n; i++)
        {
            seriesOutput += (Math.pow(-1, (i + 1))/ (2 * i - 1));                               
            
        }   

        pi = 4 * seriesOutput;

        //output - print the value of pi given number of iterations (of the series)
        System.out.println("The value of pi given the i value of " + n + " is " + pi + ".");

    }
}
