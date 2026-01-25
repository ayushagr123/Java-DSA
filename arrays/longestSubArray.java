// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
import java.util.*;
public class longestSubArray {
    public static int subArray(int nums[],int k){
        int n = nums.length;
        int maxLength= 0;
        
        for(int j=0;j<n;j++){     //Starting Index
          for(int i=n-1;i>=j;i--){   //Ending Index
            int sum= 0;
            for(int h=j;h<=i;h++){  //Sum of elements of the subarray
              sum+=nums[h];
            }
            if(sum == k){
              maxLength = Math.max(maxLength,i-j+1);
            }
          }
        }
        return maxLength; 
    }

    public static void main(String args[]){
      int arr[] = {10,5,2,7,1,9};
      System.out.println("Length of maximum sub array is "+subArray(arr,15));
    }
}


// {2,5,6,7,3,7,4,7}
// for(int i=0;i<n;i++){
//   for(int j=n;j<=i;j++){
//     for(int k=i;k<=j;k++){
//       sum+=nums[k];
//     }
//     if(sum == target){
//       maxLength = Math.max(maxLength,j-i+1);
//     }
//   }
// }