package atm_machine;

import java.util.Scanner;


public class AtmSimulation 
{
	Scanner scan = new Scanner(System.in);

	//Variables
	public double balance = 100;
	 
	
	public void makeDeposit() 
    {
        double deposit = 0.0;
		System.out.print("Enter deposit amount: \n");
		deposit = scan.nextDouble();
		if (deposit >= 0) 
        {
			this.balance += deposit;
			System.out.println("You made a deposit of " + deposit);
		}
		else 
        {
			System.out.println("Deposit invalid.");
			System.out.println("");
		}
		return;
	}
	public void makeWithdrawal() 
    {
        double withdraw;
		System.out.print("How much would you like to withdraw: ");
		withdraw = scan.nextDouble();
		
		if (withdraw <= this.balance) 
        {
			this.balance -= withdraw;
			System.out.println("You have withdrawn " + withdraw);
			System.out.println("");
			return;
		}
		else 
        {
			System.out.println("Insufficient funds.");
            return;
		}
		//else
			//System.out.println("invalid withdrawal amount"); // Make this a loop later when you have time
	}
	 
	 
	
	public void checkBalance() 
    {
        System.out.println("Your balance is: " + this.balance);  //This threw an error
        return;
	}
	
	
	public void mainMenu() 
    {
		System.out.println("Main Menu:");
		System.out.println("***********");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		System.out.println("***********");
	}
	
	
	
	
	public static void main(String[] args) 
    {
		AtmSimulation bankOne = new AtmSimulation();
		int selection;
		Scanner scan = new Scanner(System.in);
		do {
		bankOne.mainMenu();
		System.out.println("Make a selection ");
		selection = scan.nextInt(); //How do I scan a char?
		
		if (selection == 1) 
        {
			bankOne.checkBalance();
		}
		else if (selection == 2) 
        {
			bankOne.makeWithdrawal();
		}
		else if (selection == 3) 
        {
			bankOne.makeDeposit();
		}
		else if (selection == 4) 
        {
			System.out.println("Goodbye"); //Would like this to exit
		}
		else 
        {
			System.out.println("You must select from the menu. ");
		}

		}
		while (selection != 4);
	}
}