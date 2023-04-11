/*Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]
Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
Output: 4 
*/


class main
{
	public static void main(String[]args)
	{
		int[] arr={1, 1, 2, 2, 2, 2, 3};
		int x=2;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			
			
			}
		
		}
		System.out.print(count);
	
	}
}
