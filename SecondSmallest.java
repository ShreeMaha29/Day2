package week1.day2;

import java.util.Arrays;

public class SecondSmallest {
	
	public void seconsSmallest(int[] array) { 
		Arrays.sort(array);
		System.out.println(array[1]);	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmallest smallest = new SecondSmallest();
		int[] array =  {23,21,17,45,67,107,5,8,39,32,89,22 };
		smallest.seconsSmallest(array);
	}

}
