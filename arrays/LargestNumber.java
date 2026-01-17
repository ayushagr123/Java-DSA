import java.util.*;

public class LargestNumber {
  public static int largest(int[] arr) {
    int n = arr.length;
    int max= 0;
    for(int i=0;i<n;i++){
      if(arr[i]>max) max = arr[i];
    }
    return max;
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
    System.out.println("Largest number is "+largest(arr));
  }
}
