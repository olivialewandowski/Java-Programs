/*
This program was created by Olivia Lewandowski on April 22 2023.
This program creates an array with 100 randomly chosen integers, prompts the user to enter an array index, and then either displays the corresponding value or displays "out of bounds" if there is an exception. 
 */

import java.util.*;

public class ArrayIndexOutOfBoundsExceptionDemo 
{
    public static void main(String [] args)
    {
        //declarations
        Scanner kb = new Scanner(System.in);
        int[] randomArray = new int[100];   //array of 100 integers
        Random random = new Random();
        int userIndex, integer;           

        for (int i = 0; i < randomArray.length; i++)        //generate the array
        {
            randomArray[i] = random.nextInt(1000);    //generate integers between 0 and 999 within the array, for simplicity 
        }
    
        //input - get user input
        System.out.print("Enter an array index: ");
        userIndex = kb.nextInt();

        //processing + output - try catch block
        try 
        {
            integer = randomArray[userIndex];               //make a variable for the specified element in order to print easier
            System.out.println("There is an element at " + userIndex + ", which is " + integer);
        } 
        catch (Exception ex)                                //print out of bounds if there is an array index out of bounds exception
        {
            System.out.println("Out of Bounds.");
        }

        //i didn't create a method block to throw the exception, as it was not necessary
    }
}
