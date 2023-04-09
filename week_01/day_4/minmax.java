class minmax
{
	public static void main(String[]args)
	{
		int[] arr={3,8,19,3,2,7,6};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
			
				}
			
			}
			System.out.println(max);
			int sum=min+max;
			if(sum%2==0)
			{
				System.out.println("even number");
			
			}else
			{
				System.out.println("Odd number");
			}
		
	}
}




