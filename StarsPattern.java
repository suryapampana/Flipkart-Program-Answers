
public class StarsPattern {

	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(i%2!=0)
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=7;i>0;i--)
		{
			for(int k=0;k<i;k++)
			{
				if(i%2!=0)
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
