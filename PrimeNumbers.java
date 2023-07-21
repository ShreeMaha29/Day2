package week1.day2;

public class PrimeNumbers {

	public void checkPrime(int number){  
		  int halfNumber = number/2;
		  boolean flag = true;      
		       
		  if(number == 0||number == 1){  
		   flag = true;      
		  }else {
			  
		   for(int i=2;i<=halfNumber;i++){    
			   
		    if(number%i==0){      
		     flag = false;
		     break;      
		    }      
		   }      
		  }
		  if(flag == true)  { 
			   System.out.println(number+" is prime number");
			   } else {
			   System.out.println(number+" is not a prime number");
		   }
		
	}  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers p = new PrimeNumbers();
		p.checkPrime(2);
	}

}
