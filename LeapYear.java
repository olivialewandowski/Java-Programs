/*
    This program was created by Olivia Lewandowski, February 19 2023
    This program uses a for loop to iterate through all years between 101 and 2100, and prints all of the leap years, 10 per line
 */

public class LeapYear
{
    public static void main(String [] args)
    {
        //declarations
        int i;
        int numberOfLeapYears = 0;

        //input - none

        //processing - for loop to go through each year between 101 and 2100 and if statement using mod to find all leap years
        for(i = 101; i <= 2100; i++)
        {
            if(i % 4 == 0)
            {
                System.out.print(i + " ");
                numberOfLeapYears += 1;
                
                //if statement to print 10 leap years per line, using the number of leap years mod 10 == 0
                if (numberOfLeapYears % 10 == 0) 
                {
                    System.out.println();
                }
            }
        }
        //ouput - print the number of leap years
        System.out.println("The number of leap years in this period is " + numberOfLeapYears + "!");
    }
}
