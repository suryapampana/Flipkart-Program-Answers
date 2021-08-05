

class FibonacciSeries{  
public static void main(String[] qamar)
	{
		int targetedNumber = 5;
		int a=0,b=1,temp=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<targetedNumber;i++)
		{
			temp=a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
			
		}
	}
}  