/*Write a program to print the array element in the pattern below(i.e swastika pattern)?
            Example : input  : Array = [[1,2,3],[4,5,6],[7,8,9]]
                 Output =  1 4 5 6 9 7 8 5 2 3
*/

class main
{
	public static void main(String[]args)
	{
		int [][] arr = { {1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		 int row=5;
		 int col=5;
		 
		 int rowmid=(row/2); 
		 int colmid=(col/2); 
		 
		 for(int i=0;i<colmid;i++)  //col mid tak loop
		 {
		 	System.out.print(arr[0][i]+" ");
		 }
		 for(int i=0;i<row;i++) //col mid sa row ko increase karatin
		 {
		 	System.out.print(arr[i][colmid]+" ");
		 
		 }for(int i=0;i<col;i++) //col sa row-1 tak
		 {
		 	System.out.print(arr[i][row-1]+" ");
		 
		 }
		 for(int i=row-1;i>colmid;i--) //colmid 
		 {
		 	System.out.print(arr[i][0]+" ");
		 }
		 for(int i=0;i<col;i++)
		 {
		 	System.out.print(arr[rowmid][i]+" ");
		 	
		 
		 }
		  for(int i=rowmid;i>=0;i--)
		 {
		 	System.out.print(arr[i][row-1]+" ");
		 }
		 
	}
}
