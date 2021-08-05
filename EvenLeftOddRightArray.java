

public class EvenLeftOddRightArray {

	/*public static void main(String[] q)
	{
		int arr[]={12,34,45,9,8,90,3};
		int even=0;
		int odd=arr.length - 1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2 == 0 && arr[i] < arr[even])
			{
				arr[even]=arr[i];
				even++;
			}
			else if(arr[i]%2 == 0 && arr[i] > arr[even])
			{
				arr[i]=arr[even+1];
				even++;
			}
			if(arr[i]%2 != 0)
			{
				arr[odd]=arr[i];
				odd--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}*/
	public static void main(String[] q)
	{
		int arr[]={12,34,45,9,8,90,3};
		System.out.print("Before : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int left=0;
		int right=arr.length-1;
		int temp;
		
		while(left<right)
		{
			while(arr[left]%2 == 0 && left<right)
			{
				left++;
			}
			while(arr[right]%2 != 0 && left<right)
			{
				right--;
			}
			if(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println();
		System.out.print("After : ");

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
