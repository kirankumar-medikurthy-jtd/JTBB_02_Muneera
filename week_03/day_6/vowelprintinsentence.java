class main
{
 
	public static void main(String[]args)
	{
		
		String str="welcome to JTD jtbb bootcamp";
		

		int start=0;
		int previous=0;
		
		while(start<str.length())
		{
			while(start<str.length() && str.charAt(start)!=' ')
			{
				start++;
			}
			String temp=str.substring(previous,start);
                        findVowel(temp);
			start=start+1;
			previous=start;
			
		}
	
	}
	public static void findVowel(String str)
	{
		String vowel="";
		String consonants="";
		for(int i=0;i<str.length();i++)
		{
			
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
				{
					vowel+=str.charAt(i);
				
				}else {
					consonants += str.charAt(i);
				}
				
		}
		System.out.println(vowel);
		System.out.println(consonants);
	}
	
	
	/*public static String findConsonants(String str)
	{
		String vowel="";
		String con="";
		for(int i=0;i<str.length();i++)
		{
			
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
				{
					vowel+=str.charAt(i);
				
				}
				else
				{
					con+=str.charAt(i);
				}
				
		}
		return con;
				
	}*/
	
	
	public static int frequency(String str)
	{
	 	int count = 1;
		for (int i = 0; i < str.length(); i++)
	       	{
			   
		    for (int j = 0; j < i; j++)
            	    {
		        if (str.charAt(j) == str.charAt(i))
		        {
		            count++;
		           break;
		        }
            	    }
        	}
        	return count;
	}
	
	
	
    
}    


