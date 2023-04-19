class main
{
	public static void main(String[]args)
	{
		
		
		int[][]arr={{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16},{17,18,19,20,21,22,23,24},{5,6,7,8,9,0,1,2},{1,2,3,4,5,6,8,9},{9,10,11,12,13,14,15,16},{9,8,7,6,5,4,3,2},{2,5,3,4,7,9,3,1}};
	
		int row=8;
		int col=8;
		
		int rowmid=(row/2);
		int colmid=(col/2);
		
	
		for(int i=col-1;i>=colmid;i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		int m=1;
		for(int i=colmid+1;i<col;i++)
		{
		 	System.out.print(arr[m][i]+" ");
		 	m++;
		}
		int e=rowmid+1;
		
		for(int i=col-2;i>=colmid;i--)
		{
			System.out.print(arr[e][i]+" ");
			e++;
		}
	}
}
