/*
    This program was created on February 3rd, 2023 by Olivia Lewandowski.
    This program takes the user input for two coordinates, location 1 and location 2, and outputs the Euclidean distance between the two. 
 */

import java.util.Scanner;

public class DistanceCalculator
{
    public static void main(String [] args)
    {
        //declarations
        double x1, x2, y1, y2;
        double xDifference;
        double yDifference;
        double distance;
        Scanner kb = new Scanner(System.in);

        //input
        //ask user for location coordinates
        System.out.print("Enter the x coordinate for location 1 (x1): ");
		x1 = kb.nextDouble();
        System.out.print("Enter the y coordinate for location 1 (y1): ");
        y1 = kb.nextDouble();

        System.out.print("Enter the x coordinate for location 2 (x2): ");
        x2 = kb.nextDouble();
        System.out.print("Enter the y coordinate for location 2 (y2): ");
        y2 = kb.nextDouble();

        //processing
        //create variables for coordinate difference
        xDifference = x2 - x1;
        yDifference = y2 - y1;
        //use the Euclidean distance formula to calculate the distance between the two locations
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));

        //output
        //display the distance
        System.out.println("The distance between the two coordinates is: " + distance);
    }
}
