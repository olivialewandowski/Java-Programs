/*
This program was created by Olivia Lewandowski on March 25, 2023 
This program creates a class called location with the fields row, column, and maxValue
It creates an instance of the location class an applies it to an array in order to get the largest element in the array and where it is located, using methods pertaining to the class to do so
 */

import java.util.*;

public class LocationDemo 
{
    public static void main (String [] args)
    {
        //get scanner object
        Scanner kb = new Scanner(System.in);

        //declare variables to get user input
        int rows, columns;

        //get user input for rows and columns in the array
        System.out.print("Enter the number of rows and columns in the array: ");
        rows = kb.nextInt();
        columns = kb.nextInt();

        //now create the array with those variables
        double[][] numArr = new double[rows][columns];

        //now use nested for loops to get the values in the array from the user - assuming it isn't a ragged array, since the example run only asks for the number of rows and columns once
        System.out.println("Enter the array: ");        // didn't ask for values one by one, as per model
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                numArr[i][j] = kb.nextDouble();
            }
        }

        //create a new instance of the location class using the user array
        Location location = Location.locateLargest(numArr);

        //output - print largest element and where it is located (represented by indicies in the array, not actual row and column)
        System.out.println("The largest element is " + location.getMaxValue() + ", and it is located at (" + location.getRow() + ", " + location.getColumn() + ") ");
    }
}

class Location
{
    //state: properties or attributes or data or fields
    public int row, column;
    public double maxValue;

    //constructors
    //no-arg constructor
    public Location() 
    {
        row = 0;
        column = 0;
        maxValue = 0;
    }

    //arg constructor- all args
    public Location(int newRow, int newColumn, double newMaxValue) 
    {
        row = newRow;
        column = newColumn;
        maxValue = newMaxValue;
    }

    //behavior - methods
    //getter methods
    public int getRow() 
    {
        return row;
    }
    
    public int getColumn() 
    {
        return column;
    }
    
    public double getMaxValue() 
    {
        return maxValue;
    }
    
    //setter methods - just like last problem, setters aren't necessary because there is no need to update field values 

    //regular methods - method to locate the largest value in the array
    public static Location locateLargest(double [][] a)
    {
        //declare variables needed for this specific method
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[maxRow][maxColumn];

        //nested for loops to iterate through the whole 2d array until the 
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if (a[i][j] > maxValue) 
                {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        //return a new instance of the location class, using the max values for the parameters
        Location location = new Location(maxRow, maxColumn, maxValue);
        return location;
    }
}