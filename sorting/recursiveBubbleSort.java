public class recursiveBubbleSort {
    public static void sort(int[] arr, int n,int j,int i){
      if(i>=j) return;
      else{
        if(arr[i]>arr[i+1]) {
          //Swapping
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
      sort(arr,n,j,i+1);
      if(j>0) sort(arr,n,j-1,0);
    }
    public static void main(String args[]){
      int arr[] = {2,1,5,8,4,3};
      sort(arr,6,5,0);
      for(int i=0;i<6;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
