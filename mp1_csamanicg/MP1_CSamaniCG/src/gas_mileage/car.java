/*
Carmen Samaniego ---- Cps161 Fall 2021 ------ Bai Jing ------ MP1
*/

package gas_mileage;

import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		
		//Declaration of Variables
		Scanner scan = new Scanner(System.in);
		double gasUsed, mpg, milesTraveled;
		
		//User Input
		System.out.println("Welcome. Lets calculate your car's mpg.");
		System.out.println("==========================================");
		System.out.print("How many miles have you traveled? ");
		milesTraveled = scan.nextDouble();
		System.out.print("How many gallons of gas did you use? ");
		gasUsed = scan.nextDouble();
		
		//Processing 
		mpg = milesTraveled / gasUsed;
		
		//Output
		System.out.printf("Based on the numbers you gave, you are getting %.2f" , mpg);
		System.out.println(" miles to the gallon.");
		
		//scan.close(); //This closes my scanner and made the yellow line go away, did not change the output though

	}

}
