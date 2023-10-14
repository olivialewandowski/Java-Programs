/*
    This program was created by Olivia Lewandowski on March 3, 2023.
    This program uses the bubble-sort algorithm to sort numbers in ascending order. It takes ten numbers and invokes the bubble sort method in order to display the sorted numbers. 
 */

import java.util.*;

public class SortArray 
{
    public static void main (String [] args)
    {
        //declarations
        Scanner kb = new Scanner(System.in);
        double [] arr = new double [10];

        //input - for loop to get user input
        for(int i = 0; i <= arr.length-1; i++)
        {
            if(i == 0)  //if statement to only display "Enter 10 numbers" on the first iteration
            {
                System.out.print("Enter 10 numbers. Enter number " + (i+1) + ": ");
                arr[i] = kb.nextDouble();
            }
            else
            {
                System.out.print("Enter number " + (i+1) + ": ");
                arr[i] = kb.nextDouble();
            }
        }

        //processing - invoke bubbleSort method
        bubbleSort(arr);

        //output - prints array of sorted integers (in ascending order)
        System.out.println(Arrays.toString(arr));
    } 

    //bubbleSort method - takes an array and sorts it in ascending order
    public static double [] bubbleSort(double [] arr)
    {
        for(int i = 0; i < arr.length-1; i++)        //nested for loop to iterate through the array and compare the values (via the index) side by side
        {
            for(int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])       //if the lower index value is greater than one higher, then switch the values, as we need them in ascending order
                {
                    double temp = arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
                else                        //else, continue, as they are already in the correct place
                {
                    continue;
                }
            }
        }
        return arr;
    }
}
