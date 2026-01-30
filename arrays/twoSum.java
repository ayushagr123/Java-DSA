import java.util.*;
public class twoSum {
  public static int[] sum(int[] nums, int target){
        int diff = 0;
        int i;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] indx = new int[2];
        for(i=0;i<nums.length;i++){
            diff = target-nums[i];
            if(map.containsKey(diff)){
                indx[0] = map.get(diff);
                break;
            }
            else if(nums[i]<=target){
                map.put(nums[i],i);
            }
        }
       indx[1]= i;
       return indx;
  } 
  public static void main(String args[]){
    int[] arr = {2,7,11,15};
    int[] indx = sum(arr,9);
    for(int i:indx){
      System.out.print(i+" ");
    }
    
  }
}
