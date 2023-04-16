import java.util.Scanner;
class SeperateWords 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); // Taking input Sentence  from the user
       
        // Word seperation logic from the sentences
        int start = 0;
        int previous = 0;
        int WordCount = 0;
        
        while(start < str.length()) 
        {
            while(start < str.length() && str.charAt(start) != ' ') 
            {
                start++;
            }
            	String temp = str.substring(previous, start);
            	WordCount += 1;
            
            	// Checking word is palindrome or not and checking word length odd or even
            	if(isPalindrome(temp) && temp.length() % 2 != 0) 
            	{
                	System.out.println("Palindrome :" + temp); // word printing
            	}
            	
            	// calling the ReverseWord function here
           
            		ReverseWord(temp);
            		start = start + 1;
            		previous = start;
        }
        System.out.println("Word Count :" + WordCount); // getting word count from the sentence
    }
    
    
    // Checking weather the word is palindrome or not
    public static boolean isPalindrome(String str)
    {
        int start = 0;
        int end = str.length() - 1;
        while(start < end) 
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
   
    //Reversing the words present in a sentence
    public static void ReverseWord(String str)
    {
        char[] strarray = str.toCharArray();
        int start = 0;
        int end = strarray.length -1 ;
        
        while(start < end) 
        {
            char temp = strarray[start];
            strarray[start] = strarray[end];
            strarray[end] = temp;
            start++;
            end--;
        }
        
        //System.out.print(CharArrayToString(strarray));
        System.out.print(EvenIndicesCharacter(strarray));
    }
    
    
    // Converting character array into a string 
    public static String CharArrayToString(char[] array)
    {
        String result = "";
        for(int i = 0; i < array.length; i++) 
        {
            result += String.valueOf(array[i]);
        }
        return result+" ";
    }
   
   
    // printing the evenIndecies character in a word
    public static String EvenIndicesCharacter(char[] strarray)
    {
        String evenIndicesCharacter = "";
        for(int i = 0; i < strarray.length; i++)
        {
            if(i % 2 == 0)
            {
                evenIndicesCharacter += String.valueOf(strarray[i]);
            }
        }
        return evenIndicesCharacter+" ";
    }
}
