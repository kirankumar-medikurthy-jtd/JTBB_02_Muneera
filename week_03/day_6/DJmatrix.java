class main
{
	public static void main(String[]args)
	{
		int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		int row=5;
		int col=5;
		int rowmid=(row/2);
		int colmid=(col/2);
		//D
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i=1;i<col-1;i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i=1;i<row-1;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		
		}
		for(int i=row-2;i>=1;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		
		}
		System.out.print(".........");
		
		
		//J
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		
		}
		for(int i=1;i<row-1;i++)
		{
			System.out.print(arr[i][colmid]+" ");
		
		}
		for(int i=colmid;i>=0;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		
		}
		
		System.out.print("*****");
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		
		}
		for(int i=1;i<row-1;i++)
		{
			System.out.print(arr[i][colmid]+" ");
		
		}
		for(int i=colmid;i>=0;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		
		}
		
		System.out.print("........");
		
		//T
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(arr[i][colmid]+" ");
		
		}
		
		System.out.print(".......");
		
		//B
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i=1;i<col-1;i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i=1;i<rowmid;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(arr[rowmid][i]+" ");
		
		}
		for(int i=rowmid+1;i<row-1;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		
		}
		for(int i=row-1;i>=1;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		
		System.out.print("*******");
		//B
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
			
		}
		for(int i=1;i<rowmid;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(arr[rowmid][i]+" ");
		}
		for(int i=rowmid+1;i<row-1;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		
		}
		for(int i=row-1;i>=1;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
}
