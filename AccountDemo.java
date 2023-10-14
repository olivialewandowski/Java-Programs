/*
This program was created by Olivia Lewandowski on April 1 2023 
This program creates a class called account that has fields of id, balance, annual interest, and date created. 
In this program, an array of account objects is created and the methods in the class are used to pick the options of withdraw, check balance, deposit, and exit. 
*/

import java.util.*;

public class AccountDemo 
{
    public static void main(String[] args) 
    {
        // create 10 account objects in an array, with ids 0-9 and initial balance $100
        // declare array with size 10
        Account[] accounts = new Account[10];
        // for loop to make an account with ids 0-9
        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i] = new Account(i, 100);
        }

        // create scanner object and initialize id, choice
        Scanner kb = new Scanner(System.in);
        int id = 0;
        int choice;

        // get an id 0 through 9
        while (true) 
        {
            System.out.print("Enter an id: ");
            id = kb.nextInt();

            // check if the entered id is valid
            if (id < 0 || id >= accounts.length) 
            {
                System.out.println("Invalid id. Try again.");
                continue; //this allows for the program to ask for a new id
            }

            //now print main menu
            while(true) 
            {
                System.out.println("");
                System.out.println("Main menu:");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");

                // get user selection
                System.out.print("Enter a choice: ");
                choice = kb.nextInt();

                // do task (and invoke method) based on user selection
                if (choice == 1) 
                {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } 
                else if (choice == 2) 
                {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = kb.nextDouble();
                    accounts[id].withdraw(amount);
                } 
                else if (choice == 3) 
                {
                    System.out.print("Enter amount to deposit: ");
                    double amount = kb.nextDouble();
                    accounts[id].deposit(amount);
                } 
                else if (choice == 4) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid choice, try again.");
                }
            }
        }
    }
}

//creating account class
class Account 
{
    //state: properties or attributes or data or fields
    private int id; 
    private double balance; 
    private static double annualInterestRate;
    private Date dateCreated; 

    //constructors
    //no-arg constructor
    public Account()
	{
		id = 0;
		balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
	}
    
    //arg constructor that takes id and balance parameters
    public Account(int newId, double newBalance)
    {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    //behavior - methods
    //getter methods
    public int getId() 
    {
        return id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public static double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    //setter methods - no setter for dateCreated it won't be changing (it only stores the date once, when the account is created)
    public void setId(int newId) 
    {
        id = newId;
    }

    public void setBalance(double newBalance) 
    {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) 
    {
        annualInterestRate = newAnnualInterestRate;
    }

    //regular methods

    public double getMonthlyInterestRate() 
    {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() 
    {
        return balance * getMonthlyInterestRate();
    }

    //these methods are void - no need to return a new value, just alter the account balance
    public void withdraw(double num)        
    {
        balance = balance - num;
    }

    public void deposit(double num) 
    {
        balance = balance + num;
    }
}