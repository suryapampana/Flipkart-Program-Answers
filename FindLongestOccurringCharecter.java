
import java.util.LinkedHashMap;
import java.util.Set;

//Java program to output the maximum occurring character 
//in a string 
public class FindLongestOccurringCharecter {

	/*public static void main(String[] args) {

		String str = "geeksffffffffffforrrrrrrrrrrrgeeks"; 
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		
		Set<Character> s = map.keySet();
		//System.out.println(s);
		int count=1;
		char mostOccusrringChar=' ';
		for(char c : s)
		{
			if(map.get(c) > count)
			{
				count = map.get(c);
				mostOccusrringChar = c;
				
				//break;
			}
		}
		System.out.println("The most occurring Character is : "+mostOccusrringChar +" occurred "+count+ " times");
	}	
	
}
	
	
	
====================================================================================	*/
	static final int ASCII_SIZE = 256; 
	static char getMaxOccuringChar(String str) 
	{ 
		// Create array to keep the count of individual 
		// characters and initialize the array as 0 
		int count[] = new int[ASCII_SIZE]; 
	
		// Construct character count array from the input 
		// string. 
		int len = str.length(); 
		for (int i=0; i<len; i++) 
			count[str.charAt(i)]++; 
	
		int max = -1; // Initialize max count 
		char result = ' '; // Initialize result 
	
		// Traversing through the string and maintaining 
		// the count of each character 
		for (int i = 0; i < len; i++) { 
			if (max < count[str.charAt(i)]) { 
				max = count[str.charAt(i)]; 
				result = str.charAt(i); 
			} 
		} 
	
		return result; 
	} 
	
	// Driver Method 
	public static void main(String[] args) 
	{ 
		String str = "ccaabbbbccbbdcc"; 
		System.out.println("Max occurring character is " + 
							getMaxOccuringChar(str)); 
	} 
} 
