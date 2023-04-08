class targetvalue
{
	public static void main(String[]args)
	{
		int[] arr = {2,3,4,6,8,1};
		int target = 13;
		System.out.println(targest(arr,target));
		
	}
	public static String targest(int[] arr,int target)
	{
		String flag = "no:"+"sum is not equal to target";
		
		for(int i = 0;i < arr.length-1;i++)
		{
			for(int j = i + 1;j < arr.length-1;j++)
			{
				for(int k=i+2;k<arr.length-1;k++)
				{
					if(arr[i] + arr[j]+arr[k] == target)
					{
						flag = +i+","+j+","+k+"= "+target;
						break;
					}
				}
				
			
			}
		}
		return flag;
		
	}
}
