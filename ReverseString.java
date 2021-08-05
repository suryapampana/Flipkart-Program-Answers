

import java.util.Scanner;
 
public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        char[] rev=new char[str.length()];
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));        		
        }
        
        for(int j=0;j<sb.length();j++)
        {
        	if(str.charAt(j) != ' ')
        	{
        	rev[j]=sb.charAt(j);
        	}
        	else if(str.charAt(j) == ' ' && sb.charAt(j)==' '){
        		rev[j]=' ';
        	}
        	else if(str.charAt(j) == ' ' && sb.charAt(j)!=' ')
        	{
        		rev[j]=' ';
        		rev[j+1]=sb.charAt(j);
        	}
        }
        System.out.println("Reversed string is:    "+sb);
        System.out.println(rev);
    }
}