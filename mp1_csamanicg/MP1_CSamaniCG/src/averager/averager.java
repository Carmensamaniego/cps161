/*
Carmen Samaniego ---- Cps161 Fall 2021 ------ Bai Jing ------ MP1
*/

package averager;

import java.util.Scanner;

public class averager {
	
	public static void main(String[] args) {

		//Variables
		int num1, num2, num3, totalVal, numAverage;
		Scanner scan = new Scanner(System.in);
		
		//User Input
		System.out.print("Enter your first number: ");
		num1 = scan.nextInt();
		System.out.print("Enter your second number: ");
		num2 = scan.nextInt();
		System.out.print("Enter your last number: ");
		num3 = scan.nextInt();
		scan.close();
		
		totalVal = num1 + num2 + num3;
		numAverage = totalVal / 3;
		
		//Output
		System.out.println("The total of your 3 numbers is: " + totalVal);
		System.out.println("The average of your 3 numbers is: " + numAverage);
		
	}

}
