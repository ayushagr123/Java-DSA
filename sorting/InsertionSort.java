public class InsertionSort {
  public static void sort(int[] arr,int n){
      for(int i=0;i<=n-1;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          j--;
        }
      }
  }
  public static void main(String[] args) {
    int[] arr = {9,14,15,12,6,8,13};
    sort(arr, 7);
    for(int i=0;i<7;i++){
     System.out.print(arr[i]+" ");
    }
  }
}
