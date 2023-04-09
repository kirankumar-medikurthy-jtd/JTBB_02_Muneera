/*Write a program to replace 0’s with 1’s and 1’s with 0’s in a 2D Array?
Example : input : [[1,1,0],[0,0,1],[1,0,1]]
                 Output : [[0,0,1],[1,1,1],[0,1,0]]*/
 class replace0
 {
    public static void main(String[] args) 
    {
        int[][] arr = {{1, 1, 0}, {0, 0, 1}, {1, 0, 1}};
        
        
        //for (int i = 0; i <arr.length; i++) 
        //{
            for (int j = 0; j < arr.length; j++) 
            {
                if (arr[j] == 0) 
                {
                    	arr[j] = 1;
                } else 
                {
                    	ar[j] = 0;
                }
            }
       // }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j <arr.length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

