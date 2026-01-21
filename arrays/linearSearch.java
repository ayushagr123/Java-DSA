import java.util.*;
public class linearSearch {
  public static int search(int[] arr, int n){
    int i;
    boolean isPresent = false;
    for(i=0;i<arr.length;i++){
      if(arr[i] == n) {
        isPresent = true;
        break;
      }
    }
    if(isPresent == true) return i;
    else return -1;
  }
  public static void main(String[] args) {
    int[] arr= {1,2,3,4,5,6};
    System.out.println(search(arr,5));
  }
}

