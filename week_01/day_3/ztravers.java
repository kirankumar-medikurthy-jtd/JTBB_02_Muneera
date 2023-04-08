class ztraversal
{
	public static void main(String[] args)
	{
		int[][] array = {{1,3,4},{6,3,2},{9,2,10}};
		
		int sum = 0;
		int row = 3;
		int col = 3;
		String bag = "";
		
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 || j ==1|| i==row-1)
				{
					bag +=array[i][j] + " ";	
				}
			}
		}
		System.out.println(bag);
	}
	
}
