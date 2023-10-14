/*
    This program was created by Olivia Lewandowski on March 3, 2023.
    This program reads integers between 1 and 100, and counts the occurance of each. Input ends when zero is entered.
 */

import java.util.*;

public class IntOccurances 
{
    public static void main(String [] args)
    {
        //declarations
        int [] intArray = new int [100];        //array of 100 slots, integers inputted correspond to the index, and occurences correspond to the value attatched to their respective index (number)
        Scanner kb = new Scanner(System.in);
        int num = 1;
        
        //input - get first number - automatically distinct, therefore not included in while loop
        System.out.println("Enter an integer between 1 and 100 (enter 0 to stop): ");
        num = kb.nextInt();

        //while loop to gather the rest of the integers, stopping when the user inputs 0
        while(num != 0)
        {
            if(num != 0)
            intArray[num - 1] += 1; 
            System.out.println("Enter an integer between 1 and 100 (enter 0 to stop): ");
            num = kb.nextInt();
        }

        //processing & output - for loop to iterate through the array and print the number of occurances that correspond with each index (number)
        for(int j = 0; j <= 99; j++)
        {
            if(intArray[j] > 1)
            {
                System.out.println((j+1) + " occurs " + intArray[j] + " times");
            }
            else if(intArray[j] == 1)       //else if statement added to account for grammatical correctness - prints "time" rather than "times" for one occurance
            {
                System.out.println((j+1) + " occurs " + intArray[j] + " time");
            }
            else if(intArray[j] == 0)
            {
                continue;
            }
        }
    }
}
