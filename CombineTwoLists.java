/*
    This program was created by Olivia Lewandowski on April 22 2023. 
    This program takes the user input of 2 arrays, and calls a method "union" on them in order to find the union of the two arrays. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists 
{
    public static void main(String [] args)
    {
        //declarations - initalize the two array lists - arrays of objects
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Scanner kb = new Scanner(System.in);

        //input - get the two array lists from the user
        System.out.println("Enter 2 lists of 5 integers each: "); 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter integer " + (i + 1) + " for list 1:");
            list1.add(kb.nextInt());
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter integer " + (i + 1) + " for list 2:");
            list2.add(kb.nextInt());
        }

        //processing - create new list by calling the union method on the two user-inputted lists
        ArrayList<Integer> unionList = union(list1, list2);

        //output - print the final union list
        System.out.println("The union of the two lists is: " + unionList);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)      //method to find the union of the two lists, in no order
    {
        //first append list2 onto the end of list1
        for(int i = 0; i < list2.size(); i++)
        {
            list1.add(list2.get(i));
        }

        //now remove the duplicates in the combined list in order to complete the union (using the same formula as problem 1)
        for(int i = 0; i < list1.size(); i++)
        {
            for(int j = i + 1; j < list1.size(); j++)
            {
                if(list1.get(j).equals(list1.get(i)))
                {
                    list1.remove(j);
                    j--;
                }
            }
        }

        //now return list1
        return list1; 
    }
}
