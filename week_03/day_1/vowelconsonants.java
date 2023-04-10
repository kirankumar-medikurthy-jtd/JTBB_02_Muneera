class main
{
    public static void main(String[]args)
    {
    	String str="jtbfoundation";
    	int vowel=0;
    	int consonants=0;
    	
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
    		{
    			vowel++;
    		}else
    		{
    			consonants++;
    		}
    	}
    	System.out.println(vowel);
    	System.out.println(consonants);
    	
    }
 }

