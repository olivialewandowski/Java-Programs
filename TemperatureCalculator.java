/*
    This program was created on February 3rd, 2023 by Olivia Lewandowski.
    This program calculates the wind-chill temperature given the user's input of temperature and wind speed. 
 */

import java.util.Scanner;

public class TemperatureCalculator
{
    public static void main(String [] args)
    {
        //declarations
        double temperature;
        double windSpeed;
        double windChillTemp;
        Scanner kb = new Scanner(System.in);

        //input
        //ask user for temperature and wind speed
        //if statements used in order to ensure that user input is valid for the equation
        System.out.print("Enter a temperature between -58 and 41 degrees Fahrenheit: ");
        temperature = kb.nextDouble();
        if(temperature < -58||temperature > 41)
        {
            System.out.println("Input is invalid");
            System.exit(0);
        }
        
        System.out.print("Enter a wind speed greater than or equal to 2 mph: ");
        windSpeed = kb.nextDouble();
        if(windSpeed < 2)
        {
            System.out.println("Input is invalid");
            System.exit(0);
        }
	
        //processing
        //calculate wind-chill temperature using given formula
        windChillTemp = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        //output
        //display wind-chill temperature
        System.out.println("The wind chilled temperature is " + windChillTemp + " degrees!");
    }
}