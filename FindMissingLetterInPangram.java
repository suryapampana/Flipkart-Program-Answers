
public class FindMissingLetterInPangram {

	//Java Program to illustrate Pangram 
		// Returns true if the string 
		// is pangram else false 
		public static String checkPangram (String str) 
		{ 
			// Create a hash table to mark the 
			// characters present in the string 
			// By default all the elements of 
			// mark would be false. 
			boolean[] mark = new boolean[26]; 

			// For indexing in mark[] 
			int index = 0; 

			// Traverse all characters 
			for (int i = 0; i < str.length(); i++) 
			{ 
				// If uppercase character, subtract 'A' 
				// to find index. 
				if ('A' <= str.charAt(i) && 
						str.charAt(i) <= 'Z') 
							
					index = str.charAt(i) - 'A'; 

					// If lowercase character, subtract 'a' 
					// to find index. 
				else if('a' <= str.charAt(i) && 
							str.charAt(i) <= 'z') 
								
					index = str.charAt(i) - 'a'; 

				// Mark current character 
				mark[index] = true; 
			} 
String res="";
String all="abcdefghijklmnopqrstuvwx";//{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'};

			// Return false if any character is unmarked 
			for (int i = 0; i <= 25; i++) {
				if (mark[i] == false) {
					//return (false);
					//index=0;
					//index=all.charAt(i)-'a';
				//	System.out.println("----"+index);
					res+=all.charAt(i);
					
				}
				
			}
			// If all characters were present 
			//return (true); 
			if(res!="")
			{
				return res;
			}
			else{
			return "pangram";
			}
		} 

		// Driver Code 
		public static void main(String[] args) 
		{ 
			String str = "The quick  fox jumps over the lazy dog"; 
			System.out.println(checkPangram(str));
		/*	if (checkPangram(str) == true) 
				System.out.print(str + "  :   is a pangram."); 
			else
				System.out.print(str+ "   :   is not a pangram."); 
*/
		} 
	} 
