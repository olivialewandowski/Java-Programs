/*
    This program was created by Olivia Lewandowski on Feb 24 2023.
    This program takes the user input of milliseconds and converts it to a string in time format. 
 */

import java.util.*;

public class ConvertMillis 
{
    public static void main (String [] args)
    {
        //declarations
        long millis; 
        String timeString;
        Scanner kb = new Scanner(System.in);

        //input - ask the user for an amount of milliseconds
        System.out.println("Enter a number of milliseconds");
        millis = kb.nextLong();

        //processing - use the convertMillis method to turn milliseconds to a string in time format
        timeString = convertMillis(millis);

        //output - print the time converted from milliseconds
        System.out.println("The converted time is: " + timeString);

    }

    public static String convertMillis (long millis)
    {
        long seconds, minutes, hours; 

        seconds = (millis / 1000) % 60;                       //finds number of total seconds, then records the remainder of seconds in the seconds variable
        minutes = (millis / (1000 * 60)) % 60;                //finds number of minutes, then records remaining minutes in minutes variable
        hours = (millis / (1000 * 60 * 60));                  //records number of hours - no need to use mod for hours, as hours is the biggest unit used

        return hours + ":" + minutes + ":" + seconds;         //would prefer to use String.format("%02d:%02d:%02d") (typical time format), put refrained from doing so in order to match the specified outputs given in the homework
    }
}