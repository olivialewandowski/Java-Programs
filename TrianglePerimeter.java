/*
    This program was created on February 10th, 2023 by Olivia Lewandowski.
    This program takes the user input of the length of edge1, edge2, and edge3 of a triangle, and adds them together in order to print the perimeter of the triangle. 
    The program will also print "The input is invalid", if inputted edge lengths aren't able to create a triangle.  
*/

import java.util.*;

public class TrianglePerimeter 
{
    public static void main (String [] args)
    {
        //declarations
        double edge1, edge2, edge3;
        double perimeter;
        Scanner kb = new Scanner(System.in);
        
        //input
        //prompt user for the length of each edge of the triangle
        System.out.print("Enter the length of the first edge: ");
        edge1 = kb.nextDouble();

        System.out.print("Enter the second edge: ");
        edge2 = kb.nextDouble();
                
        System.out.print("Enter the third edge: ");
        edge3 = kb.nextDouble();

        //processing
        //equation to find perimeter
        perimeter = edge1 + edge2 + edge3;

        //output
        //if statement to determine if the triangle is valid/feasible;
        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)) 
        {
            System.out.println("The perimeter is " + perimeter);
        } 
        else 
        {
            System.out.println("The input is invalid");
        } 
    }
}
