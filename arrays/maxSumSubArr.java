public class maxSumSubArr {

    // Considers empty subarray case

    // public static void maxSubArray(int[] nums) {
    //     int n = nums.length;
    //     int maxSum =Integer.MIN_VALUE;
    //     int sum =0 ;
    //     int start =0;
    //     int maxSumStart=0;
    //     int maxSumEnd=0;
    //     for(int i=0;i<n;i++){
    //         if(sum==0) start =i;
    //         sum+=nums[i];
    //         if(sum<0){
    //             sum=0;
    //             start = i+1;
    //         } 
    //         if(sum>maxSum){
    //             maxSum = sum;
    //             maxSumStart = start;
    //             maxSumEnd = i;
    //         }
    //     }
    //     System.out.println(maxSum);
    //     for(int i=maxSumStart;i<=maxSumEnd;i++){
    //         System.out.print(nums[i]+" ");
    //     }
    // }


    // Doesn't consider empty subarray case scenario
    public static void maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum =Integer.MIN_VALUE;
        int sum =0 ;
        int start =0;
        int maxSumStart=0;
        int maxSumEnd=0;
        for(int i=0;i<n;i++){
            if(nums[i]>sum+nums[i]){
                sum = nums[i];
                start =i;
            }
            else {
                sum+=nums[i];
            }
            if(sum>maxSum){
                maxSum = sum;
                maxSumStart = start;
                maxSumEnd = i;
            }
        }
        System.out.println(maxSum);
        for(int i=maxSumStart;i<=maxSumEnd;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr = {-1};
        maxSubArray(arr);
    }
}
