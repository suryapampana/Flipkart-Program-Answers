


//A Java program to find median of two sorted arrays of 
//unequal sizes 

//A utility function to find median of two integers 
/* This function returns median of a[] and b[]. 
Assumptions in this function: Both a[] and b[] 
are sorted arrays */

public class MedianOfTwoSortedArrays {
static float findmedian(int a[], int n1, int b[], int n2) 
{ 
	int i = 0; /* Current index of 
			i/p array a[] */
	int j = 0; /* Current index of 
				i/p array b[] */
	int k; 
	int m1 = -1, m2 = -1; 
	for (k = 0; k <= (n1 + n2) / 2; k++) 
	{ 

		if (i < n1 && j < n2) 
		{ 
			if (a[i] < b[j]) 
			{ 
				m2 = m1; 
				m1 = a[i]; 
				i++; 
			} 
			else
			{ 
				m2 = m1; 
				m1 = b[j]; 
				j++; 
			} 
		} 

		/* Below is to handle the case where 
		all elements of a[] are 
		smaller than smallest(or first) 
		element of b[] or a[] is empty*/
		else if (i == n1) 
		{ 
			m2 = m1; 
			m1 = b[j]; 
			j++; 
		} 

		/* Below is to handle case where 
		all elements of b[] are 
		smaller than smallest(or first) 
		element of a[] or b[] is empty*/
		else if (j == n2) 
		{ 
			m2 = m1; 
			m1 = a[i]; 
			i++; 
		} 
	} 

	/*Below is to handle the case where 
	sum of number of elements 
	of the arrays is even */
	if ((n1 + n2) % 2 == 0) 
	{ 
		return (m1 + m2) *(float) 1.0 / 2; 
	} 
	/* Below is to handle the case where 
	sum of number of elements 
	of the arrays is odd */
	return m1; 
} 

//Driver program to test above functions 
	public static void main (String[] args) 
	{ 
	int a[] = {1, 12, 15, 26, 38 }; 
	int b[] = {2, 13, 24}; 

	int n1 = a.length; 
	int n2 = b.length; 

	System.out.println( findmedian(a, n1, b, n2)); 
	} 
} 
//Taken from google search
