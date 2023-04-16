/*Write a program to print all the elements present in the matrix in “R” traversal.
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
                        Output: 1 4 7 2 3 6 5 9*/

class  main
{
	public static void main(String[]args)
	{
		int[][]arr={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int row=3;
		int col=3;
		int rowmid=(row/2);
		int colmid=(col/2);
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][0]);
		}
		for(int j=1;j<row;j++)
		{
			System.out.print(arr[0][j]);
		
		}
		for(int i=col-1;i>=1;i--)
		{
			System.out.print(arr[rowmid][i]);
		
		}
		for(int j=rowmid+1;j<=row-1;j++)
		{
			System.out.print(arr[j][col-1]);
		}
		
	
	}

}
