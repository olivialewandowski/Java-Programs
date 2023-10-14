/*
    This program was created by Olivia Lewandowski on March 3, 2023.
    This program asks the user to enter a number of students, and their corresponding names and scores. It prints the student names in decreasing order of their scores.
    It is important to note that this program does not specify that the scores are integers, so I used double when declaring to be safe.
 */

import java.util.*;

public class SortStudents 
{
    public static void main (String [] args)
    {
        //declarations
        int numStudents;
        Scanner kb = new Scanner(System.in);

        //input - get number of students to be processed
        System.out.print("Enter the number of students to be processed: ");
        numStudents = kb.nextInt();
        kb.nextLine();      //necessary in order to consume the leftover line after nextInt()

        //initialize arrays after gathering the numStudents value
        String [] namesArr = new String [numStudents];
        int [] scoresArr = new int [numStudents];

        //for loop to gather the student names and scores for the arrays (indexes aligned, as values are gathered in same loop)
        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter student " + (i+1) + "'s name: ");
            namesArr[i] = kb.nextLine();
            
            System.out.println("Enter student " + (i+1) + "'s score: ");
            scoresArr[i] = kb.nextInt();
            kb.nextLine();      //necessary in order to consume the leftover line after nextInt()

        }
        //processing - nested for loop to sort both arrays according to the scores of the students (in descending order)
       for(int i = 0; i < numStudents; i++)
        {
            for(int j = 0; j < numStudents-1; j++)
            {
                if(scoresArr[j] < scoresArr[j+1])   //if true, move the higher score up the array, along with the correspoding name
                {
                    int temp = scoresArr[j];
                    scoresArr[j] = scoresArr[j+1];
                    scoresArr[j+1] = temp; 

                    String tempName = namesArr[j];
                    namesArr[j] = namesArr[j + 1];
                    namesArr[j + 1] = tempName;
                }
                else    //else, leave as is and go to the next iteration because it is already in the correct order
                {
                    continue;
                }
            }
        }
        //output - print the student names in decreasing order of their scores
        System.out.println("The student's names in decreasing order of their scores is: " + Arrays.toString(namesArr));
    }
}

    

