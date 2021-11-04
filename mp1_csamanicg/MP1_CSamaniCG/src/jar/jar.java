/*
Carmen Samaniego ---- Cps161 Fall 2021 ------ Bai Jing ------ MP1
*/

package jar;

import java.util.Scanner;

public class jar {

	public static void main(String[] args) {

		//Variables
		int quarters, dimes, nickels, pennies, totalCoins;
		double doubQuarters, doubDimes, doubNickels, doubPennies, allCoins;
		Scanner scan = new Scanner(System.in);
		
		//User Input
		System.out.println("Lets count all the money in your jar!");
		System.out.print("Enter the number of QUARTERS in the jar: ");
		quarters = scan.nextInt();
		System.out.print("Enter the number of DIMES in the jar: ");
		dimes = scan.nextInt();
		System.out.print("Eneter the number of NICKELS in the jar: ");
		nickels = scan.nextInt();
		System.out.print("Enter the number of PENNIES in the jar: ");
		pennies = scan.nextInt();
		scan.close();
		
		//Processing
		doubQuarters = quarters * 0.25;
		doubDimes = dimes * 0.10;
		doubNickels = nickels * 0.05;
		doubPennies = pennies * 0.01;
		totalCoins = quarters + dimes + nickels + pennies;
		allCoins = doubQuarters + doubDimes + doubNickels + doubPennies;
		
		//Output
		System.out.printf("Wow, look at all that cash: %.2f\n" , allCoins); // the "\n" makes the code go to the next line since printf doesn't
		System.out.println("Thats a total of " + totalCoins + " coins!");

	}

}
