/*
    This program was created by Olivia Lewandowski on April 22 2023.
    This program takes an array list of 10 numbers, and calls a method to output the same list but with no duplicate integers. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDuplicates 
{
    public static void main (String [] args)
    {
        //declarations
        ArrayList<Integer> intList = new ArrayList<Integer>();
        Scanner kb = new Scanner(System.in);

        //input
        System.out.println("Enter 10 integers: "); 
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter integer " + (i + 1) + ":");
            intList.add(kb.nextInt());
        }
    
        //processing - call the method on the list
        removeDuplicates(intList);
    
        //output - print the new list manually by getting each index and printing a space (to follow the specified format)
        System.out.print("The new list, with no duplicate integers is: ");
        for(int i = 0; i < intList.size(); i++)
        {
            System.out.print(intList.get(i) + " ");
        }
    }

    public static void removeDuplicates(ArrayList<Integer> list)   //method to remove duplicates
    {
        for(int i = 0; i < list.size(); i++)        //outer loop, starting with the first number and incrementing by one
        {
            for(int j = i + 1; j < list.size(); j++)        //inner loop, starting with the second number so different numbers in the list can be compared, not the same number
            {
                if(list.get(j).equals(list.get(i)))         //condition for if the elements equal each other, to remove the later duplicate in the array
                {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
