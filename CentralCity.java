/*
    This program was created by Olivia Lewandowski on March 18 2023
    This program takes the coordinates of user's cities and ouputs the central city with minimum distance to others, and what that distance is.
 */

import java.util.*; 

public class CentralCity 
{
    public static void main (String [] args)
    {
        //declarations
        double[][] cityCoordinates = new double[numCities][2];           //2d array to store city coords 
        Scanner kb = new Scanner(System.in);

        //input - ask for number of cities and city coordinates
        System.out.print("Enter the number of cities: ");
        int numOfCities = kb.nextInt();

        for (int i = 0; i < numOfCities; i++) {
            System.out.print("Enter the x-coordinate of city " + (i + 1) + ": ");
            cityCoordinates[i][0] = kb.nextDouble();

            System.out.print("Enter the y-coordinate of city " + (i + 1) + ": ");
            cityCoordinates[i][1] = kb.nextDouble();
        }

        //processing - find the central city and its total distance to all other cities
        double smallestTotalDistance = Double.MAX_VALUE;
        int centralCity = 0;

        for (int i = 0; i < numOfCities; i++) 
        {
            double totalDistance = 0;
            for (int j = 0; j < numOfCities; j++) 
            {
                if (i != j) 
                {
                    double distance = Math.sqrt(Math.pow(cityCoordinates[j][0] - cityCoordinates[i][0], 2) + Math.pow(cityCoordinates[j][1] - cityCoordinates[i][1], 2));       //use euclidean distance formula to find the total distance from cities for each city
                    totalDistance += distance;          //save variable and add distance
                }
            }

            if (totalDistance < smallestTotalDistance)       //updating variable if the new city has a smaller distance than the previous
            {
                smallestTotalDistance = totalDistance;
                centralCity = i;
            }
        }

        //output - print the central city and its total distance to all other cities
        System.out.println("The central city is city #" + (centralCity + 1));        //need to add the plus one, because it is an index. didn't ask or print city name, because it wasn't specified in instructions
        System.out.println("The total distance to all other cities is " + smallestTotalDistance);
    }
}
