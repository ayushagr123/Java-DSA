import java.util.*;

public class sorted {
   public static boolean isSorted(ArrayList<Integer> nums) {
    boolean isSort = true;
    if(nums.size()>1){
      for(int i = 0;i<nums.size()-1;i++){
        if(nums.get(i)>nums.get(i+1)){
         isSort = false;
        }
      }   
    }
    return isSort;
  }


   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter the elements of the array");
    while(sc.hasNextInt())
    {
      int num = sc.nextInt();
      arr.add(num);
    }
    System.out.println("Array sorted : "+isSorted(arr));
  }
}

