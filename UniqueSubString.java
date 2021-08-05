
//Java program to count all distinct substrings in a string 
import java.util.HashSet; 
import java.util.Set; 

public class UniqueSubString { 

	public static Set<String> distinctSubstring(String str) 
	{ 

		// Put all distinct substring in a HashSet 
		Set<String> result = new HashSet<String>(); 

		// List All Substrings 
		for (int i = 0; i <= str.length(); i++) { 
			for (int j = i + 1; j <= str.length(); j++) { 

				// Add each substring in Set 
				result.add(str.substring(i, j)); 
			} 
		} 

		// Return the HashSet 
		return result; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		String str = "abbbbbcd"; 
		Set<String> subs = distinctSubstring(str); 

		System.out.println("Distinct Substrings are: "); 
		for (String s : subs) { 
			System.out.println(s); 
		} 
	} 
} 
