package string_methods;

import java.util.Scanner;

public class MyStringMethods 
{

	// Starting Template

		Scanner scan = new Scanner(System.in);
		

		private String myStr = " ";

		public void readString()
		{
            // Prompt the user and read in a String from a Scanner class from thekeyboard
            // with the nextLine() method and store it in "myStr"
            System.out.println("Enter the string: ");
            myStr = scan.nextLine();
            System.out.println("***************************");
		} 
		public void setString(String s) 
		{
		    myStr = s;
		}
		public int countOccurrencesforS(char s) //need help here
		{
			int count = 0;
            
            for(int i = 0; i< myStr.length(); i++)
            {
                if(myStr.charAt(i) == s)
                {
                    count++;
                }

            }
            return count;

            
		}
	    
		public int countOccurrencesforC(char c) //p
		{
		 // use indexOf and return the number of occurrences of the character "c" in "myStr"
			int count = 0;
            
            for(int i = 0; i< myStr.length(); i++) //Apples are good For health
            {
                if(myStr.charAt(i) == 'c')
                {
                    count++;
                }

            }
            return count;

            
		}

		int countUpperCaseLetters(int u)
		{
		    // return the number of upper case letters in "myStr"
			//struggling
			int totalUpperCase = 0;
			//char bigLetters;
			//bigLetters = myStr.charAt(up);
			for (int i = 0; i < myStr.length(); i++) 
            {
				if(myStr.charAt(i) >= 'A' && myStr.charAt(i) <= 'Z')
                {
					totalUpperCase++;	
			    }
			}
            return totalUpperCase;
		}
		 
		int countLowerCaseLetters(int l)
		{
			int totalLowerCase = 0;
			//char smallLetters;
	    	//smallLetters = myStr.charAt(low);
			for (int i = 0; i < myStr.length(); i++) 
            {
				if(myStr.charAt(i) >='a' && myStr.charAt(i) <= 'z')
                {
						    totalLowerCase++;
				
			    }
	    	}
            return totalLowerCase;
		}
		public String printCounts(char s, char c, int u, int l)
		{
           /* return "Number of upper case letters = " + countUpperCaseLetters(u) + "\n" + 
            		"Number of Lower case letters = " +countLowerCase.() + "\n" +
            		"Number of 's' in string = " + countOccurrencesforS(s) + "\n" +
            		"Number of 'c' in string = " + countOccurrencesforC(c) + "\n"
            		
            		*/
            		
			countOccurrencesforC = c;
            countOccurrencesforS = s;
            
            System.out.println("***************************************");
            System.out.println("Analyzing: myStr="+myStr);
            System.out.println("Number of Upper case letters="+ countUpperCaseLetters(u));
            System.out.println("Number of Lower case letters=" + countLowerCaseLetters(l));
            System.out.println("Number of "+s + " is "+ countOccurrencesforS(s));
            System.out.println("Number of "+c + " is "+ countOccurrencesforC(c));
		}
		 
        public static void main(String[] args) 
        {
            MyStringMethods msm = new MyStringMethods();
            msm.readString();
            msm.printCounts('s', c, 0, 0);

            msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
            msm.printCounts("van", 'a', 0, 0);

            MyStringMethods msm2 = new MyStringMethods();
            msm2.setString("the elephant in the room wouldn't budge");
            msm2.printCounts("the", 'i', 0, 0);
		}
	}

