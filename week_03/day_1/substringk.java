/*Write a program to print all the substrings of a string whose length is equal to K value?
Input : String  = “jtdfoundation”     K = 3;

*/

public class Main
 {
    public static void main(String[] args)
     {
        String str = "jtdfoundation";
        int k = 3;
        printSubstrings(k, str);
    }

    public static void printSubstrings(int k, String str)
    {
        for (int i = 0; i <= str.length()-3; i++) 
        {
            String substr = str.substring(i,k+i);
            
            System.out.println(substr);
        }
    }
}


