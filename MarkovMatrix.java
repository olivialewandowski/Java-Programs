/*
    This program was created by Olivia Lewandowski on March 18 2023.
    This program takes a 3x3 matrix of doubles and outputs if the matrix is a Markov matrix or not (where each column sums to 1).
 */

import java.util.*;

public class MarkovMatrix 
{
    public static void main (String [] args)
    {
        //declarations
        Scanner kb = new Scanner(System.in);
        double[][] userMatrix = new double[3][3];

        //input - get user input of positive double values for the 3x3 matrix
        System.out.println("Enter the elements in a 3x3 matrix (positive, double):");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("Enter the elements in row " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) 
            {
                userMatrix[i][j] = kb.nextDouble();
            }
        }

        //output - print the correct statement displaying if the matrix is a Markov Matrix or not
        if (isMarkovMatrix(userMatrix))
        {
            System.out.print("True; this matrix is a Markov Matrix.");
        }
        else
        {
            System.out.print("False; this matrix is not a Markov Matrix.");
        }
    }

    //method to determine if the matrix is markov
    public static boolean isMarkovMatrix(double [][] m)
    {
        for (int i = 0; i < m.length; i++)          //loop to determine if th evalues are positive. if not, it returns false, as it is not a positive markov matrix.
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] <= 0) 
                {
                    return false;
                }
            }
        }

        for (int i = 0; i < m[0].length; i++)       //loop to test if the column totals all sum to 1. if so, it will return true, if not, false
        {
            double columnTotal = 0;
            for (int j = 0; j < m.length; j++) 
            {
                columnTotal += m[j][i];
            }
            if (columnTotal != 1.0) 
            {
                return false;
            }
        }
        return true;
    }
}
