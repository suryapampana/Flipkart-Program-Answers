

import java.util.*;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "geeksforgeeks"; 
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
		for(char c : s)
		{
			if(map.get(c) == 1)
			{
				System.out.println("First Non Repeating Character is : "+c);
				break;
			}
		}
	}

}
