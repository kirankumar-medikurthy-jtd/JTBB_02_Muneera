/*Write a program to print all the elements present in the matrix in “F” traversal.
             Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output: 1 2 3 4 5  7

*/

class main
{
	public static void main(String[]args)
	{
		int[][]arr={{1, 2, 3,4},{5, 6, 7,8}, {9, 10, 11,12},{13,14,15,16}};
		
		int row=4;
		int col=4;
		
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		
		}
		for(int i=0;i<row-1;i++)
		{
			System.out.print(arr[2][i]+" ");
		
		
		}
		for(int i=0;i<row-3;i++)
		{
			System.out.print(arr[3][i]);
		
		
		}
	
	
	}
}
