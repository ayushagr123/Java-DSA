public class BubbleSort{
  public static void sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
          for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]) swap(arr,j,j+1);
          }
        }
  }

   public static void swap(int[] arr,int m,int n){
    int temp;
    temp = arr[m];
    arr[m]=arr[n];
    arr[n]=temp;
 }

 public static void main(String args[]){
  int[] arr = {13,24,46,20,52,9};
  sort(arr,6);
  System.out.print("Sorted array ");
  for(int i=0;i<6;i++){
    System.out.print(arr[i]+" ");

  }
 }

}