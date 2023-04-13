/*Write a program to sort an array of 0’s, 1’s, and 2’s .
Input : Array = [0,1,2,0,1,2]
Output : [0,0,1,1,2,2]*/


class main
{
	public static void main(String[]args)
	{
		int[]arr={0,1,2,0,1,2,3,3};
		
		
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			
			
			}
		
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		
		
		}*/
		
		String bag="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				bag+=arr[i]+" ";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				bag+=arr[i]+" ";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				bag+=arr[i]+" ";
			}
		}
		
		
		System.out.println(bag);
	
	}

}
