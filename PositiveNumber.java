package week1.day2;


/*Problem statement: Check if the number is positive or negative
---------------------------------------------------------------Pseudocode:---------- 
1. Initialize a number, say, int number= 35; 
2. If a number is positive, print "The number is positive"
 If a number is negative, print "The number is negative" 
If it nether negative nor positive, print as "The number is neither positive nor negative"*/


public class PositiveNumber {
	
	
	public void checkNumber(int a) {
		if (a>0) {
			System.out.println("The number is positive");
		} else if (a<0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is neither positive nor negative");
		}
		
	}
	
	public static void main(String[] args) {
		PositiveNumber number = new PositiveNumber();
		number.checkNumber(35);
	}

}
