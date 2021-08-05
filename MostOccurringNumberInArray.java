

import java.util.HashMap;

public class MostOccurringNumberInArray {

	public static void main(String[] arg)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		int arr[] = {1, 2, 3, 4, 3, 2, 1, 4, 3, 3, 3}; 
		int j;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				j=map.get(arr[i]);
				map.put(arr[i], j+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		int highest=1;
		int highestKey=0;
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
		  //  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if(entry.getValue()>highest)
			{
				highest=entry.getValue();
				highestKey=entry.getKey();
			}
		}
		System.out.println(highestKey);
	}
}
