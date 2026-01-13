import java.util.*;
public class mergeSort {
    public static void mergesort(int[] arr,int n){
      int low=0;
      int high=n-1;
      mS(arr, low, high);
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    }
    public static void mS(int[] arr,int low,int high){
      if(low>=high) return;
      int mid = (low+high)/2;
      mS(arr,low,mid);
      mS(arr,mid+1,high);
      merge(arr,low,mid,high);
    }
    // Merge both the arrays.
    public static void merge(int[] arr, int low,int mid,int high){
      List<Integer> temp = new ArrayList<>();
      int left = low;
      int right = mid+1;
      while(left<=mid && right<=high){
        if(arr[left]<arr[right]){
          temp.add(arr[left]);
          left++;
        }
        else{
          temp.add(arr[right]);
          right++;
        }
      }
      while(left<=mid){
        temp.add(arr[left]);
        left++;
      }
      while(right<=high){
        temp.add(arr[right]);
        right++;
      }
      //Place temporary array into the original array
      for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
      }
    }
    public static void main(String args[]){
      int[] arr = {4,5,6,2,45,21,34};
      mergesort(arr,7);
    }
  }

