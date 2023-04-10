/*Write a program to print “Z” Traversal  elements present in an array?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                           Output :  1 3 4 3 9 2 10*/



class main
{
	public static void main(String[]args)
	{
	int [][]arr={{1,3,4},{6,3,2},{9,2,10}};
	
	int row=3;
	int col=3;
	
	for(int i=0;i<col;i++)
	{
		System.out.print(arr[0][i]);
	}
	int k=1;
	int j=1;
	
	while(k<row && j>=0)
	{
		System.out.print(arr[k][j]);
		k++;
		j--;
	}
	for(int m=1;m<col;m++)
	{
		System.out.print(arr[row-1][m]);
	}
	
	
	}

}
