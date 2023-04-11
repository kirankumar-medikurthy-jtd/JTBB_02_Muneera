

/*
/*Write a program to find a peak element, which is not smaller than its neighbors
Input : array[] = {5,10,20,15}
Output : 20
*/


class main
{
	public static void main(String[] args)
	{
		int[] arr = {5,10,20,15};
		int firstElement = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > firstElement)
			{
				firstElement = arr[i];	
			}
			
		}
		System.out.println(firstElement);
	
	}
		
}
