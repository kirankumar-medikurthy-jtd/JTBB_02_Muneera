/*Write a program to find 3rd Smallest Element and Second Smallest Element in an array
                Example : input :Array = [3,8,19,3,2,7,6], output :  7,3
*/

class smalarg
{
	public static void main(String[] args)
	{
		int [] arr ={3,8,19,3,2,7,6};
		//System.out.println(Smallest(arr));
	
		int min = arr[0];
		int SecondMin = arr[0];
		int next=arr[0];
		int last = arr[0];
		int ThirdMin=arr[0];
		
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				SecondMin = min;
				min = arr[i];	
					
			}
			else if(arr[i] < SecondMin)
			{
				ThirdMin = SecondMin;
				 SecondMin = arr[i];
				 
			}
			else if(arr[i] > ThirdMin)
			{
				next  = ThirdMin;
				ThirdMin = arr[i];
				
			}
			else if(arr[i] > next)
			{
			last = next;
			next = arr[i];

			}
			else if(arr[i]>last)
			{
			last = arr[i];
			}
			
		
		}
		System.out.print(last+","+SecondMin);
	}	

}
