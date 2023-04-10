/*Write a program to print indices of 2 elements in an array, Whose difference is equal to target value
Input : [1,8,2,3,9,4,5];   Target Value : 8
Output : 0 4*/



class main
{
	public static void main(String[]args)
	{
		int[]arr={1,8,2,3,9,4,5};
		int target=8;
		//String flag="noo";
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]-arr[i]==target)
				{
				System.out.println(i+" "+j);
				}
			
			}
		
		}
		
		
	
	}

}
