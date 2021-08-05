

import java.util.Scanner;

public class returnArray {

	/*Input : aabbbbbc
	Output: [2,5]
			
	Input : 1000011
	Output: [1,4]*/
	
	public static void main(String[] q)
	{
		String str="aabbbbbcb";
		int index=0;
		int count=0;
		int currCount=0;
		char c=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
			//set.add(str.substring(i, j));
				if(str.charAt(i) != str.charAt(j))
				{
					//index=0;
					break;
				}
				else if(str.charAt(i) == str.charAt(j))
				{
					index++;
				}
				count=1;
			}
				if(count>currCount)
				{
					
					currCount=count;
					count++;
				}
			}
		System.out.println(index+" : "+currCount);
	}
	
	
	
	/*public static int[] getResult(String str)
	{
		//aabbbbbc
		int[] a =new int[2];
		int LongestStart=-1;
		int LongestLength=0;
		
		char resultChar=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			//LongestLength=1;
			
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) != str.charAt(j))
						{
					
							//LongestStart=i;
							break;
						}
				LongestLength++;
			}
				if(LongestLength>LongestStart)
						{
							LongestStart=LongestLength;
							resultChar=str.charAt(i);
							//LongestLength++;
						}
			}
		System.out.println(resultChar);
		a[0]=LongestStart;
		a[1]=LongestLength;
		return a;
	}
	
	public static void main(String[] q)
	{
		String s="aabbbbbc";
		int a[]=getResult(s);
		System.out.println(a[0]+" "+a[1]);
	
	}*/
	
	
}


/*Scanner in = new Scanner(System.in);
int n = in.nextInt(), max = in.nextInt();
String s = in.next();

int left = 0, answer = 0;
int[] count = { 0, 0 };
for (char c : s.toCharArray()) {
    count[c - 'a']++;
    if (Math.min(count[0], count[1]) > max) {
        count[s.charAt(left) - 'a']--;
        left++;
    } else {
        answer++;
    }
}
System.out.println(answer);*/