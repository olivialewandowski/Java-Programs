/*
    This program was created on February 10th, 2023 by Olivia Lewandowski.
    This program takes the user input of a, b, and c from a quadratic equation, inserts them into the quadratic formula, and outputs the roots. 
*/

import java.util.*;
import java.lang.Math;

public class QuadraticFormula
{
    public static void main (String [] args)
    {
        //declarations
        double quadraticRoot1, quadraticRoot2;
        double a, b, c;
        double discriminant;
        
        Scanner kb = new Scanner(System.in);
        
        //input
        //ask user for value of a, b, and c
        System.out.println("Enter the value for a: ");
        a = kb.nextDouble();
        
        System.out.println("Enter the value for b: ");
        b = kb.nextDouble();

        System.out.println("Enter the value for c: ");
        c = kb.nextDouble();

        //processing
        //find discriminant, then use quadratic formula to calculate equation roots
        discriminant = (Math.pow(b, 2)) - (4 * a * c);

        quadraticRoot1 = (-b + Math.sqrt(discriminant))/ (2 * a);
        quadraticRoot2 = (-b - Math.sqrt(discriminant))/ (2 * a);

        //output
        //if statement using discriminant sign to determine number of roots, and display them accordingly
        if(discriminant > 0)
        {
            System.out.print("The roots of the quadratic equation are: " + quadraticRoot1 + " and " + quadraticRoot2); 
        }
        else if(discriminant == 0)
        {
            System.out.println("The root of the quadratic equation is: " + quadraticRoot1);
        }
        else
        {
            System.out.println("The quadratic equation has no real roots.");
        }
    }
}
