/*
    This program was created by Olivia Lewandowski on Feb 24 2023.
    This program takes one string and one single character, and outputs the number of instances that the specified character occurs in the string. 
    It is important to note that capital and lowercase of the same letter are considered different characters.
 */

import java.util.*;

public class InstancesOfChar 
{
    public static void main (String [] args)
    {
        //declarations
        String str;
        char a;
        int instances;

        Scanner kb = new Scanner(System.in);

        //input
        System.out.println("Enter a string: ");
        str = kb.nextLine();

        System.out.println("Enter a character: ");
        a = kb.next().charAt(0);

        //processing
        instances = count(str, a);

        //output
        System.out.println("There are " + instances + " instances of " + a + " in the string: " + str);
    }

    public static int count (String str, char a)
    {
        int instances = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == a)
                instances += 1;
        }

        return instances;
    }
}
