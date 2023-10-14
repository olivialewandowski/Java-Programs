/*
    This program was created on February 3rd, 2023 by Olivia Lewandowski.
    This program calculates the area of a triangle given the user's input of three sets of verticies (in coordinatee form).
 */

import java.util.Scanner;
import java.lang.Math;

public class  TriangleAreaCalculator 
{
    public static void main (String [] args)
    {
        //declaration
        double x1, x2, x3, y1, y2, y3;
        double side1, side2, side3;
        double s, area;
        Scanner kb = new Scanner(System.in);

        //input
        //prompt user for the coordinates of each of the three verticies, one by one
        System.out.println("Enter the x coordinate for first vertex (x1): ");
        x1 = kb.nextDouble();
        System.out.println("Enter the y coordinate for first vertex (y1): ");
        y1 = kb.nextDouble();

        System.out.println("Enter the x coordinate for second vertex (x2): ");
        x2 = kb.nextDouble();
        System.out.println("Enter the y coordinate for second vertex (y2): ");
        y2 = kb.nextDouble();

        System.out.println("Enter the x coordinate for third vertex (x3): ");
        x3 = kb.nextDouble();
        System.out.println("Enter the y coordinate for third vertex (y3): ");
        y3 = kb.nextDouble();

        //processing
        //use Euclidean distance formula to find the length of each side of the triangle (aka distance from one vertex to another)
        side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        //calculate triangle area using given formula
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        //output
        //display triange area
        System.out.println("The area of the triangle is: " + area);

    }
}
