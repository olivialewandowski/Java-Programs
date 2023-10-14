/*
    This program was created by Olivia Lewandowski, February 19 2023
    This program takes a decimal integer from a user and converts it into a binary value using a while loop
 */

import java.util.*;

public class DecimalToBinary 
{
    public static void main (String [] args)
    {
        //declarations
        int decimalInteger;
        int remainder;
        String binaryValue = "";

        Scanner kb = new Scanner(System.in);

        //input - get user input of decimal integer
        System.out.println("Enter a decimal integer: ");
        decimalInteger = kb.nextInt();

        //make new quotient variable so decimal int value is not lost
        int quotient = decimalInteger;

        //processing - while loop to get remainders, which translate to the binary values 
        while (quotient != 0)                               
        {
            remainder = quotient % 2;                       //store these remainders in the binary string
            binaryValue = remainder + binaryValue;          //add values to binary string
            quotient = quotient / 2;                        //divide quotient by 2 in order to go to the next place in the binary number system (since it is base 2)
        }

        //output - print decimal integer and corresponding binary string
        System.out.println("The binary value of " + decimalInteger + " is " + binaryValue);
    }
}
