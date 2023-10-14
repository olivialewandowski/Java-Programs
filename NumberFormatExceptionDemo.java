/*
This program was created by Olivia Lewandowski on April 22 2023.
This program includes a method to convert a binary string into a decimal number, and to throw a number format exception if the string is not binary (0 or 1).
*/

import java.util.*;

public class NumberFormatExceptionDemo 
{
    public static void main(String [] args)
    {
        //declarations
        Scanner kb = new Scanner(System.in);
        String binaryString;

        //input - get binary string
        System.out.println("Enter a binary string to be converted: ");
        binaryString = kb.nextLine();

        //processing + output - calls method to convert string, and throws exception if number format is invalid
        try 
        {
            int decimalValue = bin2Dec(binaryString);
            System.out.println(binaryString + " is equal to " + decimalValue + " as a decimal number.");
        } 
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public static int bin2Dec(String binaryString)              //conversion method
    {
        int decimalValue = 0, powerInt = 0;
        int binaryDigit;
        char binaryChar;

        for (int i = 0; i < binaryString.length(); i++) 
        {
            binaryChar = binaryString.charAt(i);                //gets character for each index of the string
            if (binaryChar != '0' && binaryChar != '1')         //throws exception if the binary character isn't valid (0 or 1)
            {          
                throw new NumberFormatException("Error: the string is not a binary string.");
            }
        }

        while (binaryString.length() > 0)                                                            //so it runs until there aren't any digits left to convert
        {
            binaryDigit = Integer.parseInt(binaryString.substring(binaryString.length() - 1));       //takes the last digit of the binary number, 
            decimalValue += binaryDigit * Math.pow(2, powerInt);                                     //according to number place
            powerInt++;                                                                              //as for each iteration, the number place shifts one
            binaryString = binaryString.substring(0, binaryString.length() - 1);                     //removes the digit after it is done converting
        }                   
        return decimalValue;
    }
}