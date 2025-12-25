// class reverseArray{
//   public static void array(int i,int j,int[]arr){
//     if(i>=j) return;
//     arr[i]=arr[j]; Incoorect way of swapping
//     arr[j]=arr[i];
//     array(i+1,j-1);
//   }
//   public static void main(String args[]){
//     int []arr = {2,4,8,7};
//     array(0,4,arr);
//   }
// }

import java.util.*;
class reverseArray{
  public static void array(int i,int[]arr,int n){
    if(i>=n/2) return;
    swap(arr,i,n-i-1);
    array(i+1,arr,n);
  }
  public static void swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void main(String args[]){
    int []arr = {2,4,8,7};
    array(0,arr,4);
    for(int j=0;j<4;j++){
      System.out.print(arr[j]+" ");
    }
  }
}
