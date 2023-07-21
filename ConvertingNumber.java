package week1.day2;

/*Assignment:3
Problem statement: Convert a negative number to positive number
-----------------------------------------------Pseudocode: 
1. Initialize an integer with a negative number like, int number = -40;
2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive number
4. Print as below "The number -40 is converted to 40"*/

public class ConvertingNumber {
	
	public void convertNumber(int a) {
		
		if (a<0) {
			System.out.println("The Number is Negative");
			System.out.println("The number "+a +" is converted to "+(a*-1));
			
		}else if (a>0) {
			System.out.println("The Number is Positive");
		}else {
			System.out.println("The Number is neither Negative or Positive");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertingNumber number = new ConvertingNumber();
		number.convertNumber(-2476);
	}

}
