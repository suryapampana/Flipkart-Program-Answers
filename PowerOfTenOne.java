
public class PowerOfTenOne {

	 public static boolean isPowerOfTen(long input) {

	        if (input % 10 != 0 || input == 0) {
	            return false;
	        }

	        if (input == 10) {
	            return true;
	        }

	        return isPowerOfTen(input/10);
	    }

	    public static void main(String[] args) {

	        System.out.println("1000: " + isPowerOfTen(1000));
	        System.out.println("4: " + isPowerOfTen(40));
	        System.out.println("0: " + isPowerOfTen(0));
	        System.out.println("10: " + isPowerOfTen(10));
	        System.out.println("100: " + isPowerOfTen(100));
	    }
	}
	 // driver method to test power method 
   /* public static void main(String[] args) 
    { 
    	
        // check the result for true/false and print. 
        System.out.println(isPower(50) ? 1 : 0); 
        System.out.println(isPower(1) ? 1 : 0); 
        System.out.println(isPower(200) ? 1 : 0); 
        System.out.println(isPower(100) ? 1 : 0); 
        System.out.println(isPower(1000) ? 1 : 0); 
    } 
} */
   /* ------------------------------------------------------------------------------------------
     Returns true if y is a power of x 
    public static boolean isPower(int x) 
    { 
        // The only power of 1 is 1 itself 
        if (x == 1) 
            return false; 
  
        // Repeatedly compute power of x 
        int pow = 1; 
        while (pow < x) 
            pow = pow * x; 
  
        // Check if power of x becomes y 
        return (pow == x); 
    }
	
    public static boolean isPowerOfTen(long input) {

        if (input % 10 != 0 || input == 0) {
            return false;
        }

        if (input == 10 || input==1) {
            return true;
        }

        return isPowerOfTen(input/10);
    }

    public static void main(String[] args) {

        System.out.println("1000: " + isPowerOfTen(1000));
        System.out.println("4: " + isPowerOfTen(4));
        System.out.println("0: " + isPowerOfTen(0));
        System.out.println("10: " + isPowerOfTen(10));
        System.out.println("100: " + isPowerOfTen(100));
        System.out.println("1: " + isPowerOfTen(1));
    }
}*/