/*Write a program to print all the element in a string in the form “T” pattern in a 2D array
Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
Output : 1 2 3 5 8*/



class main
{
	public static void main(String[]args)
	{
		int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=3;
		int col=3;
		
		//int rowmid=(row/2); 
		int colmid=(col/2);
		
		 for(int i=0;i<row;i++)  //col mid tak loop
		 {
		 	System.out.print(arr[0][i]+" "); 
	
		 }
		 for(int i=0;i<row;i++) //col mid sa row ko increase karatin
		 {
		 	System.out.print(arr[i][colmid]+" ");
		 }
	}
}
