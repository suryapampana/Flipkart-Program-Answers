


/*Find Prime fraction of a number
if no. Is 6 prime fraction is 2,3
If no. Is 24 then prime fraction is 2,2,2,3
If no. Is negative or 1 then there is no fraction it should be empty*/

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String args[]){
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a number ::");
	      number = sc.nextInt();
	      
	      if(number<=0)
	      {
	    	  System.out.println("Please enter the positive number");
	      }
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	      sc.close();
	   }
}
