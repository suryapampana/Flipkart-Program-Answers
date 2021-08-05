


//Java program to find Minimum Distance 
//Between Words of a String
public class FindAbsoluteDistanceBetweenWords {
	public static void main(String[] q)
	{
		String s="geeks hello for the geeks the contribute practice";
		String[] string = s.split(" ");
		
		String word1="hello";
		String word2="practice";
		int distance=0;
		for(int i=0;i<string.length;i++)
		{
			/*if(string[i].equals(word1))
			{*/
				if(string[i].equals(word1)){
					//System.out.println("value of i : "+i);
				for(int j=i+1;j<string.length;j++)
				{
					//System.out.println("value of j : "+j);
					if(!string[j].equals(word2) && string[j].equals(word1))
					{
						distance=0;
						continue;
						
					}
					else if(!string[j].equals(word2) && !string[j].equals(word1))
					{
						
						distance++;
					}
					if(string[j].equals(word2))
					{
						break;
					}
					
				}break;
			}
				
			//}
		}
		System.out.println("Distance : "+distance);
	}
/*
//Function to calculate the minimum 
//distance between w1 and w2 in s 
static int distance(String s,String w1,String w2) 
{ 
	
	if (w1 .equals( w2) ) 
		return 0 ; 

	// get individual words in a list 
	String words[] = s.split(" "); 

	// assume total length of the string 
	// as minimum distance 
	int min_dist = (words.length) + 1; 

	// traverse through the entire string 
	for (int index = 0; index < words.length ; index ++) 
	{ 

		if (words[index] .equals( w1)) 
		{ 
			for (int search = 0; search < words.length; search ++) 
			{ 
				if (words[search] .equals(w2)) 
				{ 
					// the distance between the words is 
					// the index of the first word - the 
					// current word index 
					int curr = Math.abs(index - search) - 1; 
						System.out.println(curr);
					// comparing current distance with 
					// the previously assumed distance 
					if (curr < min_dist) 
					{ 
						min_dist = curr ; 
					} 
				} 
			} 
		} 
	} 
	
	// w1 and w2 are same and adjacent 
	return min_dist; 
} 

//Driver code 
public static void main(String args[]) 
{ 
	
String s = "geeks for the geeks the contribute practice"; 
String w1 = "for" ; 
String w2 = "contribute" ; 

System.out.print( distance(s, w1, w2) ); 

} */
} 
