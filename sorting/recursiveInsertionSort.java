public class recursiveInsertionSort {
    public static void sort(int[] arr, int j, int n){
      if(j>=n-1) return; //Base condition
      for(int i=j;i>=0;i--){
        if(arr[i]>arr[i+1]){
          int temp = arr[i+1];
          arr[i+1]= arr[i];
          arr[i]= temp;
        }
      }
      sort(arr,j+1,n);
    }
    public static void main(String[] args) {
      int[] arr = {2,4,6,4,6,3,7,2};
      sort(arr,0,8);
      for(int i=0;i<8;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
