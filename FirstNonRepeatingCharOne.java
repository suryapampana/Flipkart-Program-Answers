

//Java program to find first non-repeating character 

/*We can use string characters as index and build a count array. Following is the algorithm.

1) Scan the string from left to right and construct the count array.
2) Again, scan the string from left to right and check for count of each
 character, if you find an element who's count is 1, return it.
 
Example:
	Input string: str = geeksforgeeks
 1: Construct character count array from the input string.
    ....
   count['e'] = 4
   count['f'] = 1
   count['g'] = 2
   count['k'] = 2
   ��
 2: Get the first character who's count is 1 ('f').

*/
public class FirstNonRepeatingCharOne {

	static final int NO_OF_CHARS = 256; 
	static char count[] = new char[NO_OF_CHARS]; 
	
	/* calculate count of characters 
	in the passed string */
	static void getCharCountArray(String str) 
	{ 
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++; 
			//System.out.println("count"+count[str.charAt(i)]);

		}
	} 
	
	/* The method returns index of first non-repeating 
	character in a string. If all characters are repeating 
	then returns -1 */
	static int firstNonRepeating(String str) 
	{ 
		getCharCountArray(str); 
		int index = -1, i; 
	
		for (i = 0; i < str.length(); i++) 
		{ 
			if (count[str.charAt(i)] == 1) 
			{ 
				index = i; 
				break; 
			} 
		} 
		System.out.println(index);
	return index; 
	} 

	// Driver method 
	public static void main (String[] args) 
	{ 
		String str = "geeksforgeeks"; 
		int index = firstNonRepeating(str); 
		
		System.out.println(index == -1 ? "Either all characters are repeating or string " + 
				"is empty" : "First non-repeating character is " + str.charAt(index)); 
	} 
} 
