/*
    This program was created by Olivia Lewandowski on April 1 2023. 
    This program uses the BigDecimal class to find the approximate value of e rounded to 25 digits, in increments of 100 for i.
 */

import java.math.*;

public class ApproximateE 
{
    public static void main (String [] args)
    {
        //processing - use for loop to get e based on iterating through the series - in increments of 100
        for (int i = 100; i <= 1000; i += 100)
        {
            //initialize the eOutput and nFactorial (factorial variable) by creating new objects of the BigDecimal class
            BigDecimal eOutput = BigDecimal.ZERO;       //constant 0 - sets it to 0, since e is initially 0 before the series starts
            BigDecimal nFactorial = BigDecimal.ONE;     //constant 1 - sets it to 1, since factorial starts at 1

            //nested for loop to execute the series based on the value of i
            for(int j = 0; j <= i; j++)
            {  
                nFactorial = nFactorial.multiply(BigDecimal.valueOf(j + 1)); 
                BigDecimal seriesValue = BigDecimal.ONE.divide(nFactorial, 25, BigDecimal.ROUND_HALF_UP);      //follows series 1/i!, and uses BigDecimal to round to 25 digits, and to round up instead of truncating
                eOutput = eOutput.add(seriesValue);                   
            }

            //output - print the result for every increment of 100
            System.out.println("The value of e, when i = " + i + ", is " + eOutput + "!");
        }
    }
}
