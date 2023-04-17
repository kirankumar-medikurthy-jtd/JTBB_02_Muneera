/*Write a program to print odd length and longest  palindromic substring from the string (Fouziya)
            Example: String str = “babad”

*/

class oddpalindromsubString
{
	public static void main(String[] args)
	{
		String str = "babad";
		String largestSubstring = str.charAt(0);
		
			for(int j = 0; j < str.length(); j++)
			{
				//String substr="";
				
				for(int m = j+1; m <= str.length(); m++)
				{
					String substr=str.substring(j,m);
					if(findPalindrom(substr) && substr.length() % 2 == 1 && substr.length() >= largestSubstring.length())
					{
						System.out.println(substr);
						largestSubstring = substr;
					}
				}
			}
		
	}
	
	public static boolean findPalindrom(String str)
	{
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				flag =  false;
			}	
			start++;
			end--;
		}
		return flag;
		
		
	}
}
