/*Write a program to find subarray with given sum, Array contain non negative integer?
Input : [1,4,20,3,10,5]  sum = 33
Output : 2,3,4;*/


class main
{
	public static void main(String[]args)
	{
		int[]arr={1,4,20,3,10,5};
		int sum=33;
		
	
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				
				int subarrsum=0;
				String subarr="";
				
				for(int k=i;k<=j;k++)
				{
					subarrsum+=arr[k];
					subarr+=k+" ";
					
				
				
				}
				if(subarrsum==sum)
				{
					System.out.println(subarr);
				}
			
			}
		
		}

	}
	
}
