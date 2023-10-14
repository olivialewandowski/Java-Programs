/*
    This program was created by Olivia Lewandowski on Feb 24 2023.
    This program takes an integer input and outputs if the number is a palindrome or not. It uses two methods, reverse and isPalindrome in doing so. 
    It is important to note that the reverse method doesn't output a zero in front of a number that ends in 0, but this issue is null in the program because a palindrome cannot end in 0, since no numbers start with 0. 
 */

import java.util.*;

public class PalindromeInteger 
{
    public static void main (String [] args)
    {
        //declarations
        int number;
        Scanner kb = new Scanner(System.in);

        //input - ask user for integer
        System.out.println("Enter an integer: ");
        number = kb.nextInt();

        //output - prints if the number is a palindrome or not
        if(isPalindrome(number) == true)
        {
            System.out.println(number + " is a palindrome.");
        }
        else
        {
            System.out.println(number + " is not a palindrome.");
        }
    }

    //reverse method - returns the reversal of an integer
    public static int reverse (int number)
    {
        int remainder;
        int reverseNumber = 0; 

        while(number != 0)
        {
            remainder = number % 10;                                //mod 10 since we are in base 10
            reverseNumber = reverseNumber * 10 + remainder;         //multiplied by 10 to move the numbers up a space, then add remainder to attatch new number to the end of the reversed number
            number /= 10;                                           ///divide quotient by 10 in order to go to the next place in the number system
        }

        return reverseNumber;

    }

    //isPalindrome method - returns true if number is a palindrome and false if it's not
    public static boolean isPalindrome (int number)
    {
        int reverseNumber = reverse(number);
        if(number == reverseNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} 
