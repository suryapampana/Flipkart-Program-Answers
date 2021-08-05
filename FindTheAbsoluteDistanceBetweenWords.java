


	//Java program to find Minimum Distance 
	//Between Words of a String
	public class FindTheAbsoluteDistanceBetweenWords {
		public static void main(String[] q)
		{
			String s="geeks hello for the geeks the hello contribute practice";
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
}
