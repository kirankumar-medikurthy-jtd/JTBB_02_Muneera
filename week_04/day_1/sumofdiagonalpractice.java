class main
{
	public static void main(String[]args)
	{
	int [][] arr ={ {1 , 3 , 4},{6 , 3 , 2},{ 9 , 2 , 10} };
	
	
	int row=3;
	int col=3;
	
	int i=0;
	int j=0;
	
	while(i<row && j<col)
	{
		System.out.print(arr[i][j]);
		i++;
		j++;
	
	}
	}
	int a=0;
	int k=col-1;
	
	while(a<row && k>=0)
	{
		System.out.print(arr[a][k]);
		a++;
		k--;
	}
	
}
	
