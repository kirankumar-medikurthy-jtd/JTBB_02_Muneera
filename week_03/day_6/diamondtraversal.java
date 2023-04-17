
/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 3 2 6 8*/

class diamondtraversal
{
	public static void main(String[]args)
	{
		int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		//int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
	
		int row=5;
		int col=5;
		
		int rowmid=(row/2);
		int colmid=(col/2);
		
	
		for(int i=colmid;i>=colmid;i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		int e=1;
		for(int i=colmid+1;i<col;i++)
		{
		 	System.out.print(arr[e][i]+" ");
		 	e++;
		}
		int m=rowmid+1;
		
		for(int i=col-2;i>=colmid;i--)
		{
			System.out.print(arr[m][i]+" ");
			m++;
		}
		int a=row-2;
		
		for(int i=colmid-1;i>=0;i--)
		{
			System.out.print(arr[a][i]+" ");
			
			a--;
		}
		int h=rowmid-1;
		
		for(int i=1;i<colmid;i++)
		{
		
			System.out.print(arr[h][i]+" ");
			h--;
		}
		
		
	}

}
