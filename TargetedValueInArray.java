
/*Target Value = 6
out put = 2+4 =6            return 2    element required .

Target Value = 12
output = 1+2+3+4 = 10   return -1  target value out of Scope .*/

public class TargetedValueInArray {

	public static void main(String[] Qamar)
	{
	int[] numbers = {1, 2, 4, 3, 5, 7, 8, 9 };
	int targetedValue = 5 ;
	for (int i = 0; i < numbers.length; i++) 
	{ 
		int first = numbers[i]; 
		for (int j = i + 1; j < numbers.length; j++) 
			{ 
				int second = numbers[j]; 
				if ((first + second) == targetedValue) 
					{ 
					//System.out.printf("(%d, %d) %n", first, second);
					System.out.println(first+" + "+second+" = "+targetedValue);
					} 
				/*else if((first + second) != targetedValue)
				{
					System.out.println("Targeted Value out of scope");
					//break;
				}*/
			} 
		}

	}
}