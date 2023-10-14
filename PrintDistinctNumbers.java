/*
    This program was created by Olivia Lewandowski on March 3, 2023.
    This program reads ten numbers from the user and displays the number of distinct numbers and prints what these numbers are, separated by one space.
    It is important to note that this problem doesn't specify integers, therefore I accounted for if the user inputted a floating point number by declaring my variables with "double."
 */

import java.util.*;

public class PrintDistinctNumbers 
{
    public static void main (String [] args)
    {
        //declarations
        double [] distinctArr = new double [10];
        double num;
        int distinctCounter = 0;
        Scanner kb = new Scanner(System.in);

        //input & processing - for loop to get 10 user inputted numbers
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            num = kb.nextDouble();

            //nested for loop to check if a number is repeated, and therefore not distinct - if it is repeated, the loop breaks
            boolean distinct = true;
            for(int j = 0; j < distinctCounter; j++)
            {
                if (num == distinctArr[j]) 
                {
                    distinct = false;
                    break;
                }
            }
                //if statement - if the number is distinct (distinct = true), add the number to the corresponding index in the array
                if(distinct)
                {
                    distinctArr[distinctCounter] = num;
                    distinctCounter++;
                }
        }
        //output - print the number of distinct numbers and what they are (using a for loop to remove brackets)
        System.out.println("The number of distinct numbers is " + distinctCounter);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCounter; i++) 
        {
            System.out.printf("%.0f ", distinctArr[i]);     //in order to follow the problem precisely, I used format in order to get rid of the floating point, however I would rather not have in order to account for floats/doubles
        }
    }
}
