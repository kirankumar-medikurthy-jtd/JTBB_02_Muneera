class smallestMissingPositiveNumber {
    public static void main(String[] args){
        int[] arr = {2,3,-10,-1,6,8};
        int smallestPostiveNumber = Integer.MAX_VALUE;
        int largetNegativeNumber = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 && arr[i] < smallestPostiveNumber){
                smallestPostiveNumber = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0 && arr[i] > largetNegativeNumber){
                largetNegativeNumber = arr[i];
            }
        }
        System.out.println(smallestPostiveNumber + largetNegativeNumber);
    }
}
