package week1.day2;

/*Assignment:2

Check the given number is palindrome or not 

Int num =34343

Initialize a  temporary variable.

Reverse the number (using for loop and add to the temporary variable)

Compare the temporary number with reversed number

If both numbers are same, print "palindrome number"

Else print "not palindrome number"?*/


public class Palindrome {
	
	
	public void palindrome(int a) {
		
		int number = a;
		int reverse = 0;  
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		if (a == reverse) {
			System.out.println(a+" is a palindrome.");
		} else {
			System.out.println(a+" is not a palindrome.");
		}
		
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.palindrome(34343);

	}

}
