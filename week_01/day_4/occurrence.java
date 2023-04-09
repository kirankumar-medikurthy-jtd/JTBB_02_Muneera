//Write a program to print the occurrence of every element present in an array?
 //Example : input : [2,5,6,5,6,9,9,7,2,9]
                  //Output : 2 : 2, 5 : 2, 6 : 2, 9 : 3, 7 : 1
                  
public class ccurrence {
    public static void main(String[] args) {
        int[] arr = {2,5,6,5,6,9,9,7,2,9};
        
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + ":" + count + " times.");
            }
        }
    }
}

