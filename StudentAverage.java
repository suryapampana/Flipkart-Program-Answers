
import java.util.LinkedHashMap;
import java.util.Set;

public class StudentAverage {

	public static void main(String[] args) {
		
       // String students[][] = {{"jerry","65"}, {"bob","1"}, {"jerry","23"},{"jerry","23"}, {"jerry","100"},{"Eric","83"}};
		 String students[][] = {{"jerry","60"}, {"bob","55"}, {"jerry","40"},{"bob","45"},{"bob","55"},{"jerry","90"}};
        int length =  students.length;
        
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for (int col = 0; col <length; col++) {
            //int sum = 0;
            //System.out.println(students[col]);
            for (int row = 0; row < 2; row++) 
            {
              //  sum += array[row][col];
            	int count=1;
            	if(row==0)
            	{
            	if(map.containsKey(students[col][row]))
            	{
            		count++;
            		map.put(students[col][row], (map.get(students[col][row])+ Integer.parseInt(students[col][row + 1]))/count);
            	}
            	else
            	{
            		map.put(students[col][row], Integer.parseInt(students[col][row + 1]));
            	}
            	}
            }
        }
        int count=1;
		String StudentName="";
        Set<String> s = map.keySet();
		for(String c : s)
		{
			System.out.println(c+ " "+map.get(c));
			if(map.get(c) > count)
			{
				count = map.get(c);
				StudentName = c;
				
				//break;
			}
		}
		System.out.println();
		System.out.println("The Highest Average Marks  : "+count+" Scored By "+StudentName);
	}
}