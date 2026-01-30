// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
import java.util.*;
public class longestSubArray {
    // public static int maxSubArr(int nums[],int k){
    //     int n = nums.length;
    //     int maxLength= 0;
        
    //     for(int j=0;j<n;j++){     //Starting Index
    //       for(int i=n-1;i>=j;i--){   //Ending Index
    //         int sum= 0;
    //         for(int h=j;h<=i;h++){  //Sum of elements of the subarray
    //           sum+=nums[h];
    //         }
    //         if(sum == k){
    //           maxLength = Math.max(maxLength,i-j+1);
    //         }
    //       }
    //     }
    //     return maxLength; 
    // }



    // Better approach , uses hash map , For ordered map: TC=> O(NlogN)
    //                                   For unordered map:TC=> Avg case O(N*1) 
    //                                                          Worst case O(N*N)
    //  SC=> O(N)

    // public static int maxSubArr(int[] nums, int target){
    //   HashMap<Integer,Integer> map = new HashMap<>();
    //   int maxLength = 0;
    //   int sum = 0;
    //   int n = nums.length;
    //   for(int i=0;i<n;i++){
    //     sum+=nums[i];
    //     if(sum!=map.get())
    //     map.put(sum,i);
    //     if(sum == target){
    //       maxLength = Math.max(maxLength,i+1);
    //     }
    //     else if(map.containsKey(sum-target)){
    //       maxLength = Math.max(maxLength,i-map.get(sum-target));
    //     }
    //   }
    //   return maxLength;
    // }


    //Optimal approach
    //Two pointer approach
    public static int maxSubArr(int[] nums, int target){
      int maxLength = 0;
      int sum=0;
      int n= nums.length;
      int j= 0;
      for(int i=0;i<n;i++){
        sum+=nums[i];
        if(sum>target){
          while(sum>target){
            sum = sum-nums[j];
            j++;
          }
        }
        else if(sum==target){
          maxLength = Math.max(maxLength,i-j+1);
        }
      }
      return maxLength;
    }

    public static void main(String args[]){
      int arr[] = {1,2,3,1,1,1,1,3,3};
      System.out.println("Length of maximum sub array is "+maxSubArr(arr,6));
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

//Better approach


