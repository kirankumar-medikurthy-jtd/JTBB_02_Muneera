class missingPrimesAndMaximum
{
	public static void main(String[] args)
	{
		int[] array = {2,8,9,10};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.print(max+","+min );
		//System.out.print(min +" ");
		
		
		
		
		int result[] = new int[20];
		for(int i=0;i<array.length;i++)
		{
			result[array[i]] += 1;
		}
		//miss ele
		for(int i = min;i<=max;i++)
		{
			result[i] += 1;
		}
		int count = 0;
		for(int i = 0 ;i<result.length;i++)
		{
			
				//System.out.print(result[i]+" ");
			if(result[i] == 1)
			{
				count++;
				System.out.println("...."+i);
				if(prime(i))
				{
					System.out.println("missing primenumbers"+i);
				}
				
				
				if(count == 1)
				{
				System.out.println("third largest"+i);
				}
					
			}
			

		}
	}
	public static boolean prime(int num)
	{
		if(num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for(int i = 2;i < num;i++)
			{
				if(num % 2 == 0)
				{
					return false;
				}
			}
			return true;
		}
		
	}
}
