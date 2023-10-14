/*
This program was created by Olivia Lewandowski on March 25, 2023 
This program creates a class called linear equation with fields of a, b, c, d, e, and f (values)
It creates an instance of the linear equation class, uses a method to determine if it is solvable, and uses a method to solve it
 */

import java.util.*;

public class LinearEquationDemo 
{
    public static void main (String [] args)
    {
        //get scanner object
        Scanner kb = new Scanner(System.in);

        //declare variables to get user input
        double a, b, c, d, e, f;
        
        //get user input for each value
        System.out.print("Enter the value for a: ");
        a = kb.nextDouble();
        
        System.out.print("Enter the value for b: ");
        b = kb.nextDouble();

        System.out.print("Enter the value for c: ");
        c = kb.nextDouble();

        System.out.print("Enter the value for d: ");
        d = kb.nextDouble();

        System.out.print("Enter the value for e: ");
        e = kb.nextDouble();

        System.out.print("Enter the value for f: ");
        f = kb.nextDouble();

        //create instance, or object, of linear equation class, inputting user values for parameters
        LinearEquation linearEquation1 = new LinearEquation(a, b, c, d, e, f);

        //output - if solvable, print result, if not, report that the equation has no solution
        if(linearEquation1.isSolvable())
        {
            System.out.println("The x value of this system is " + linearEquation1.getX() + ", and the y value is " + linearEquation1.getY() + "!");
        }
        else
        {
            System.out.println("The equation has no solution.");
        }
            

    }
}

class LinearEquation
{
    //state: properties or attributes or data or fields
    private double a, b, c, d, e, f;

    //constructors
    //arg constructor - all args
    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF)
    {
        a = newA;
		b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    //behavior - methods
    //getter methods
    public double getA() 
    {
        return a;
    }

    public double getB() 
    {
        return b;
    }

    public double getC() 
    {
        return c;
    }

    public double getD() 
    {
        return d;
    }

    public double getE() 
    {
        return e;
    }

    public double getF() 
    {
        return f;
    }

    //setter methods - none needed because there is only one constructor, and once the linear equation object is created with that constructor, the fields are't going to change

    //regular methods - to determine if system is solveable, and to solve for x and y individually
    public boolean isSolvable() 
    {
        if((a * d) - (b * c) != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }

    public double getX() 
    {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    public double getY() 
    {
        return ((a * f) - (e * c) / ((a * f) - (b * c)));
    }

}