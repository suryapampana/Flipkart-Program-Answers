

public class FindTheSmallestElementInArray {

	public static void main(String[] q)
	{
		/*this code will work for the smallest element of an array but not for second smallest element
		 * int a[]={1,2,0,5,6,3,2};
		int smallestelement=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallestelement)
			{
				smallestelement=a[i];
			}
		}
		System.out.println(smallestelement);*/
		
		/*With the following code we can find smallest element of an array of different locations like first smallest,second smallest etc*/
		int a[]={5,2,0,5,6,3,2};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}
}
