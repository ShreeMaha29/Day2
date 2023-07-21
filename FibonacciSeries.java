package week1.day2;

public class FibonacciSeries {
	
	public void fibonacciSeries(int range) {
		int firstNumber = 0;
		int secondNumber = 1;
		
		for (int i=0; i<range; i++) {
			System.out.println(firstNumber);
			int temp = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonacciSeries(10);
	}

}
