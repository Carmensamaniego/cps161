/*
Carmen Samaniego ---- Cps161 Fall 2021 ------ Bai Jing ------ MP1
*/

package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		//Variables
		int dollarPrice, centPrice, dollarPaid, centPaid, totalCentPrice, totalCentPaid, roughChange;
		int changeMinusDollars, dollars, quarters, dimes, nickels, pennies;
		int oneQuarter = 25, oneDime =10, oneNickel =5, onePenny = 1;
		double changeOwed;
		Scanner scan = new Scanner(System.in);
		
		//User Input
		System.out.print("Enter the price (just dollar amount): ");
		dollarPrice = scan.nextInt();
		System.out.print("Enter the price (just cent amount): ");
		centPrice = scan.nextInt();
		System.out.println("");
		System.out.print("Enter the amount paid (just dollars): ");
		dollarPaid = scan.nextInt();
		System.out.print("Enter the amount paid (just cents): ");
		centPaid = scan.nextInt();
		
		//Processing
		dollarPrice *= 100;
		dollarPaid *= 100;
		totalCentPrice = dollarPrice + centPrice;
		totalCentPaid = dollarPaid + centPaid;
		roughChange = totalCentPaid - totalCentPrice;
		changeMinusDollars = roughChange % 100;
		dollars = roughChange / 100;
		quarters = (changeMinusDollars / 25);
		changeMinusDollars = changeMinusDollars - quarters * oneQuarter;
		dimes = changeMinusDollars / 10;
		changeMinusDollars = changeMinusDollars - dimes * oneDime;
		nickels = changeMinusDollars / 5;
		changeMinusDollars = changeMinusDollars - nickels * oneNickel;
		pennies = changeMinusDollars / onePenny;
		changeOwed = roughChange *.01;
		
		
		
		System.out.println("=====================================");
		System.out.println("Change Returned:");
		System.out.printf("Total change owed: %.2f\n", changeOwed);
		System.out.println(dollars + " Dollar(s)");
		System.out.println(quarters + " Quarter(s)");
		System.out.println(dimes + " Dime(s)");
		System.out.println(nickels + " Nickel(s)");
		System.out.println(pennies + " Pennies");
		

	}

}
