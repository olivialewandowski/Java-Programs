/*
    This program was created by Olivia Lewandowski on March 18 2023
    This program takes a 2d array and outputs the coordinates of the largest value in the array.
 */

import java.util.*;

public class LocateLargestElement 
{
    public static void main (String [] args)
    {
        //declarations
        int rows, columns;
        Scanner kb = new Scanner(System.in);

        //input - getting rows and assuming that it can be a ragged array with dif # of columnsn (using loops)
        System.out.print("Enter the number of rows in the array: ");
        rows = kb.nextInt();
        double[][] userArray = new double[rows][];
        
        for (int i = 0; i < rows; i++) 
        {
            System.out.print("Enter the number of columns for row " + (i+1) + ": ");
            columns = kb.nextInt();
            userArray[i] = new double[columns];
            
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("Enter the element for row " + (i+1) + ", column " + (j+1) + ": ");
                userArray[i][j] = kb.nextDouble();
            }
        }
        //output - call the method on the array in order to get the index of the largest values, and print
        int[] locationArray = locateLargest(userArray);
        System.out.print("The location of the largest element of the array is at (" + locationArray[0] + "," + locationArray[1] + ")");

    }
    //method to find the largest element
    public static int [] locateLargest(double [][] a)
    {
        int[] locationArray = new int[2];
        double largestElement = a[0][0];
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if (a[i][j] > largestElement)       //if element is greater than previous largest, update variable and save coords
                {
                    largestElement = a[i][j];
                    locationArray[0] = i;
                    locationArray[1] = j;
                }
            }
        }
        return locationArray;
    }
}
