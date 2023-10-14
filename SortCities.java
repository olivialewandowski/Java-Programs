/*
    This program was created on February 10th, 2023 by Olivia Lewandowski.
    This program takes the user input of city1, city2, and city3, and outputs the three cities in alphabetical (ascending) order. 
    
*/

import java.util.*;

public class SortCities 
{
    public static void main (String [] args)
    {
        //declarations
        String city1, city2, city3;

        Scanner kb = new Scanner(System.in);

        //input
        //ask the user for the name of each of the three cities
        System.out.println("Enter the name of the first city: ");
        city1 = kb.nextLine();

        System.out.println("Enter the name of the second city: ");
        city2 = kb.nextLine();

        System.out.println("Enter the name of the third city: ");
        city3 = kb.nextLine();

        //processing 
        //put the cities into an array in order to sort them alphabetically (using the sort function)
        String [] cities = {city1, city2, city3};
        java.util.Arrays.sort(cities);

        //output
        //use for loop to print each city
        System.out.println("The cities in alphabetical order are: ");
        for (int i = 0; i < cities.length; i++) 
        {
        System.out.println(cities[i]);
        }
    }
}
