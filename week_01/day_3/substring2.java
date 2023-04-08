class subString
 {
    public static void main(String[] args)
     {
    	String str = "bootcamp";
     
     	int end = str.length();
     	int count=0;
	for (int i = 0; i <= end; i++)
    	{
    		for (int j = i; j <= end-1; j++) 
    		{
        		count++;
    		}
	}
	System.out.print(count);

    }
}
