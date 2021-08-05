

import java.util.LinkedHashMap;
import java.util.Set;

public class LongestOccuringCharecter {

	public static void main(String[] q)
	{
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