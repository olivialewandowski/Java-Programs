/*
    This program was created by Olivia Lewandowski on Feb 24 2023.
    This program takes the user input of three sides (doubles), and outputs the area of the triangle IF the inputs are valid (if the sides are able to form a triangle, not just a line).
 */

import java.util.*;

public class ValidTriangle 
{
    public static void main (String [] args)
    {   
        //declarations
        double side1, side2, side3;
        Scanner kb = new Scanner(System.in);
        
        //input - prompt user for the length of each edge of the triangle
        System.out.print("Enter the length of the first edge: ");
        side1 = kb.nextDouble();

        System.out.print("Enter the second edge: ");
        side2 = kb.nextDouble();
                
        System.out.print("Enter the third edge: ");
        side3 = kb.nextDouble();

        //processing + output - prints the area of the triangle if the user inputs are valid
        if(isValid(side1, side2, side3) == true)
        {
            System.out.println("The area of this triangle is " + area(side1, side2, side3));
        }
        else
        {
            System.out.println("The inputs are invalid.");
            System.exit(0);
        }

    }

    //isValid method - returns true if the sum of any two sides is greater than the third side
    public static boolean isValid (double side1, double side2, double side3)
    {
        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //area methods - returns the area of the triangle
    public static double area (double side1, double side2, double side3)
    {
        double s, area;

        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

}
