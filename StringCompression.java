
import java.util.*;

/*Input : aaaabbbbbbbbbccs
Output : a4b9c2s1*/
public class StringCompression {

	
	public static void main(String[] qamar)
	{
		String str = "aaaabbbbbbbbbccs";
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
		}
		Set<Character> s = map.keySet();
		for(char c : s)
		{
			System.out.print( c+ ""+map.get(c)+" ");
		}
	}
	
	
	/*public static void main(String[] args)
	{
		
		 String a = "aaaabbbbbbbbbccs";
         StringBuilder sb = new StringBuilder();

         // Establish invariant for k == 0.
         int runLen = 1;
         char runChar = a.charAt(0);

         // Advance k, re-establishing invariant for each step.
         for (int k = 1; k < a.length(); k++) {
             if (a.charAt(k) == runChar) {
                 ++runLen;
             } else {
                 sb.append(runChar).append(runLen); 
                 runLen = 1;
                 runChar = a.charAt(k);
             }
         }
         // Output the final run to get from invariant to required answer.
         sb.append(runChar).append(runLen);     
         System.out.println(sb.toString());

	}*/
}
