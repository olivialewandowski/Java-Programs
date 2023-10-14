/*
    This program was created on February 10th, 2023 by Olivia Lewandowski.
    This program takes the user input of a month and year and outputs the amount of days in that given month. 
*/

import java.util.*;

public class DaysInMonth 
{
    public static void main (String [] args)
    {

        //declarations
        String month;
        String monthName = "";
        int days = 0;
        int year;

        Scanner kb = new Scanner(System.in);

        //input
        //prompt user for the year and month
        System.out.println("Enter the year (Ex. 2000): ");
        year = kb.nextInt();
        kb.nextLine();

        System.out.println("Enter the first three letters of the month, with the first letter uppercase (Ex. Feb): ");
        month = kb.nextLine();

        //processing
        //if statement to match the user string input to the correct month and day
        if(month.equals("Jan"))
        {
            days = 31;
            monthName = "January";
        }
        else if(month.equals("Feb"))
        {
            if(year % 4 == 0) 
            {
                days = 29;
            }
            else
            {
                days = 28;
            }
            
            monthName = "February";
        }
        else if(month.equals("Mar"))
        {
            days = 31;
            monthName = "March";
        }
        else if(month.equals("Apr"))
        {
            days = 30;
            monthName = "April";
        }
        else if(month.equals("May"))
        {
            days = 31;
            monthName = "May";
        }
        else if(month.equals("Jun"))
        {
            days = 30;
            monthName = "June";
        }
        else if(month.equals("Jul"))
        {
            days = 31;
            monthName = "July";
        }
        else if(month.equals("Aug"))
        {
            days = 31;
            monthName = "August";
        }
        else if(month.equals("Sep"))
        {
            days = 30;
            monthName = "September";
        }
        else if(month.equals("Oct"))
        {
            days = 31;
            monthName = "October";
        }
        else if(month.equals("Nov"))
        {
            days = 30;
            monthName = "November";
        }
        else if(month.equals("Dec"))
        {
            days = 31;
            monthName = "December";
        }

        else
        {
            System.out.print("Input invalid, try again");
            System.exit(0);
        }
        //output
        //print the month and number of days
        System.out.println("The month " + monthName + " has " + days + " days in the year " + year);
    }
}