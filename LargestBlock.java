/*
    This program was created by Olivia Lewandowski on March 18 2023.
    This program takes a square matrix with elements 0 or 1, and outputs the maximum square submatrix whose elements are all 1s.
 */

import java.util.Scanner;

public class LargestBlock 
{
    public static void main(String[] args) 
    {
        //declarations
        int maxSubmatrixSize = 0;
        int xStart = 0;
        int yStart = 0;
        Scanner kb = new Scanner(System.in);

        //input - enter number of rows in matrix
        System.out.print("Enter the number of rows: ");
        int rows = kb.nextInt();

        //get user input of values, per column in the matrix 
        int[][] userMatrix = new int[rows][rows];
        System.out.println("Enter the elements of the matrix (0 or 1): ");
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the values in column " + (i+1) + ": ");
            for (int j = 0; j < rows; j++) 
            {
                userMatrix[i][j] = kb.nextInt();
            }
        }

        //processing - loop through all submatrices
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < rows; j++) 
            {
                //check if current element is a 1, if so, keep going
                if (userMatrix[i][j] == 1) 
                {
                    //check max submatrix size
                    int submatrixSize = 1;
                    boolean submatrixIsSquare = true;
                    while (submatrixIsSquare && i + submatrixSize < rows && j + submatrixSize < rows) 
                    {
                        for (int k = i; k <= i + submatrixSize; k++) 
                        {
                            if (userMatrix[k][j + submatrixSize] == 0) 
                            {
                                submatrixIsSquare = false;
                                break;
                            }
                        }
                        for (int k = j; k <= j + submatrixSize; k++)        //check if submatrix is square of ones, if not, not applicable      
                        {
                            if (userMatrix[i + submatrixSize][k] == 0) 
                            {
                                submatrixIsSquare = false;
                                break;
                            }
                        }
                        if (submatrixIsSquare)      //add to the submatrix size once it is proves square and possible to be bigger
                        {
                            submatrixSize++;
                        }
                    }
                    //if this submatrix is bigger, make it the max submatrix
                    if (submatrixSize > maxSubmatrixSize) 
                    {
                        maxSubmatrixSize = submatrixSize;
                        xStart = i;
                        yStart = j;
                    }
                }
                else if (userMatrix[i][j] == 0)
                {
                    continue;
                }
                else            //in case the input is something other than zero
                {
                    System.out.print("Input invalid, try again.");
                    System.exit(0);
                }
            }
        }
        //output - print statement to display starting point and size
        System.out.println("The maximum square submatrix starts at (" + xStart + ", " + yStart + ") and has size " + maxSubmatrixSize);
    }
}