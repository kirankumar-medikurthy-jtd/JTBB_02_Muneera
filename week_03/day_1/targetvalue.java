class targetvalue
{
	public static void main(String[]args)
	{
		int[] arr = {1,8,2,3,9,4,5};
		int target = 8;
		System.out.println(targest(arr,target));
		
	}
	public static String targest(int[] arr,int target)
	{
		String flag = "no:"+"sum is not equal to target";
		
		for(int i = 0;i < arr.length-1;i++)
		{
			for(int j = i + 1;j < arr.length-1;j++)
			{
				//for(int k=i+2;k<arr.length-1;k++)
				//{
					if(arr[i] + arr[j]== target)
					{
						flag = +i+","+j+"="+target;
						break;
					}
				//}
				
			
			}
		}
		return flag;
		
	}
}
