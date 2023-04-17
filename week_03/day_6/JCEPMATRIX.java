/*Write a program to print the array element in the pattern below?
            Example : input  : String str = “JCEP”*/
            
class JCEPMATRIX
{
	public static void main(String[]args)
	{
		int[][]arr={{1,2,3,4,6},{5,6,7,8,8},{9,10,11,12,3},{13,14,15,16,2},{11,12,13,14,15}};
		
		int row=5;
		int col=5;
		
		int rowmid=(row/2);
		int colmid=(col/2);
		
		//J
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(arr[i][colmid]+" ");
		}
		for(int i=colmid-1;i>=0;i--)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		System.out.print("................");
		
		//C
		
		for(int i=col-1;i>=1;i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		
		for(int i=1;i<row-1;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i=1;i<col;i++)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		
		System.out.print("********************");
		
		//E
		
		for(int i=col-1;i>=0;i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i=1;i<col;i++)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		
		for(int i=1;i<col;i++)
		{
			System.out.print(arr[rowmid][i]+" ");
		
		}
		
		System.out.print("...........");
		
		//P
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i=1;i<rowmid;i++)
		{
			System.out.print(arr[i][col-1]+" ");
		}
		for(int i=col-1;i>=1;i--)
		{
			System.out.print(arr[rowmid][i]+" ");
		}
		
	
	}

}

