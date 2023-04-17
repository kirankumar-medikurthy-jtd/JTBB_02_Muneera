/*Write a program to print the next greater element present in an array?
Example : Input: arr[] = [ 4 , 5 , 2 , 25 ]
                Output:  4      –>   5
                              5      –>   25
                               2      –>   25
                               25     –>   -1
*/

class nextgreater
{
	public static void main(String[]args)
	{
		int[]arr={4 , 5 , 2 , 25};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					count=arr[i];
				
				}
			
			}
		
		}
		System.out.print(count);
	
	}
}
