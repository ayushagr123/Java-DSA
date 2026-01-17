import java.util.*;

public class secondLargestNumber {
      public static int secondLargest(int[] nums) {
        int seclarge = -1;
        int large = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>large || nums[i]>seclarge){
                if(nums[i]>large) {
                    seclarge = large;
                    large = nums[i];
                }
                else if(nums[i]!=large){
                    seclarge = nums[i];
                }
            }
        }
        return seclarge;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");    
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array");
    for(int i = 0;i<n;i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Second Largest number is "+secondLargest(arr));
  }
}
