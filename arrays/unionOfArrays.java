import java.util.*;
public class unionOfArrays {
  public static void union(int[] arr1,int m, int[] arr2, int n){
      ArrayList<Integer> uarr = new ArrayList<>();
      int i=0;
      int j=0;
      while(i<m && j<n){
        if(arr1[i]<=arr2[j]){
          if( uarr.isEmpty() || arr1[i]!=uarr.get(uarr.size()-1)){
            uarr.add(arr1[i]);
          }
          i++;
        }
        else if(arr2[j]<arr1[i]){
          if(uarr.isEmpty() || arr2[j]!=uarr.get(uarr.size()-1)) {
            uarr.add(arr2[j]);
          }
          j++;
        }
    } 
    while(i<m){
      if(uarr.isEmpty() || arr1[i] != uarr.get(uarr.size()-1)){ 
        uarr.add(arr1[i]);
      }
      i++;
    }
    while(j<n){
      if(uarr.isEmpty() || arr2[j] != uarr.get(uarr.size()-1)){ 
        uarr.add(arr2[j]);
      }
      j++;
    }
    System.out.println("Union of both arrays is "+uarr);
  }

  public static void main (String args[]) {
      int[] arr1 ={0};
      int[] arr2 ={0,1,2,3};
      union(arr1,1,arr2,4);
    }
}
