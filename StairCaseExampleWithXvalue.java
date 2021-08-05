


//Program to find n-th stair 
//using step size 1 or 2 or 3. 
/*import java.util.*; 
import java.lang.*; */

/*Output Explanation if input is 4:
1 -> 1 -> 1 -> 1
1 -> 1 -> 2
1 -> 2 -> 1
1 -> 3
2 -> 1 -> 1
2 -> 2
3 -> 1*/
public class StairCaseExampleWithXvalue { 

	// A recursive function used by countWays 
	public static int countWays(int n) 
	{ 
		int[] res = new int[n + 1]; 
		res[0] = 1; 
		res[1] = 1; 
		res[2] = 2; 

		for (int i = 3; i <= n; i++) 
		{
			res[i] = res[i - 1] + res[i - 2] 
								+ res[i - 3]; 
		}
		for (int i = 0; i < n; i++) {
		System.out.println("res["+i+"]"+res[i]);
		}
		return res[n]; 
	} 

	// Driver function 
	public static void main(String argc[]) 
	{ 
		int n = 3; 
		System.out.println(countWays(n)); 
	} 
} 

