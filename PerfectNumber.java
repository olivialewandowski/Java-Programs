/*
    This program was created by Olivia Lewandowski, February 19 2023
    This program uses a for loop to run through integers 1 through 10000 in order to find all possible perfect numbers (4)
*/

public class PerfectNumber 
{
    public static void main (String [] args)
    {
        //declarations
        int integer; 
        int divisor; 

        //input - none

        //processing - create for loop to find perfect integers between 1 and 10000
        for(integer = 1; integer < 10001; integer++)
        {   
        //resetting sumOfDivisors within the loop so it doesn't include divisors from previous iterations
            int sumOfDivisors = 0;

            //for loop to find all possible divisors of each number, and add them to a sum of divisors
            for(divisor = 1; divisor < integer; divisor++) 
            {
                if(integer % divisor == 0)
                {
                    sumOfDivisors += divisor;
                }
            }  

        //output - print perfect integers, determined by if the sum of divisors equals the value of the integer
            if(sumOfDivisors == integer)
            {
                System.out.println(integer);
            }
        }
    }
}
