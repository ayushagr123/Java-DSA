class rotateRight {
    public static void rotate(int[] arr, int k){
        //Reverse the entire array 
        int n= arr.length;
        int j= n-1;
        for(int i=0;i<j;i++){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j--;
        }
        j= k-1;
        //Reverse the first k elements of the array
        for(int i=0;i<j;i++){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            j--;
        }
        //Reverse the remaining elements of the array
        j=n-1;
        for(int i=k;i<j;i++){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j--;
        }       
    }
    public static void main (String args[]) {
      int[] arr ={1,2,3,4,5,6,7};
      rotate(arr,3);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}