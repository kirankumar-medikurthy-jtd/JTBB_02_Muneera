/*Write a program to decipher the string?
Example : input1: a2b1c2d3e2
                 Output : “aabccdddee”*/



public class DecipherString {
   public static void main(String[] args) {
         String str = "a2b1c2d3e2";
        
       /* char[] decipher = new char[str.length()]; // create a character array to store the deciphered string
        int index = 0;
        for (int i = 0; i < str.length(); i += 2)
        {
            char currentChar = str.charAt(i);
            int count = str.charAt(i+1) - '0'; // subtracting '0' converts the char to its corresponding integer value
            for (int j = 0; j < count; j++) {
                decipher[index++] = currentChar;
            }
        }
        
        String decipheredString = new String(decipher); // convert the character array to a string
        System.out.println("Deciphered string: " + decipheredString); */
        
        
        
        
        String result  = "";
        for(int i =1;i<str.length();i++)
        {
        	if(i%2 ==1)
        	{
        		int num = Character.getNumericValue(str.charAt(i));
        		for(int j = num;j>0;j--)
        		{
        			result += str.charAt(i-1);
        		}
        	}
        }    
        System.out.print(result);
    }     

}
