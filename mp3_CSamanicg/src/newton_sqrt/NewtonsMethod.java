package newton_sqrt;

import java.util.Scanner;
import java.lang.Math;


public class NewtonsMethod 
{
	
    Scanner scan = new Scanner(System.in);
	
	public double num;
	
	public int getNum() 
    {
		System.out.println("Enter N for Newton ");
		int n = scan.nextInt();
		this.num = n;
		return n;
	}
	
	public double sqRoot(int n) 
    {
		this.num = n;
		double s = Math.sqrt(n);
		return s;
		
	}

	public static void main(String[] args) 
    {

        NewtonsMethod mOne = new NewtonsMethod();
        
        int num = mOne.getNum();

        double root = mOne.sqRoot(num); 
		System.out.print(root);
		
	

	}
}
