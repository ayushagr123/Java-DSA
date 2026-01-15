public class quickSort{
    public static void qs(int[] arr, int low ,int high){
      if(low<high){
        quickSort obj = new quickSort();
        int pIndex= obj.partition(arr, low, high);
        qs(arr, low, pIndex-1);
        qs(arr, pIndex+1, high);
      }
    }
    public int partition(int [] arr, int low, int high){
      int pivot = arr[low];
      int i= low;
      int j= high;
      while(i<j) {
        while(arr[i]<=pivot && i<=high-1){
          i++;
        }
        while(arr[j]>pivot && j>low-1){
          j--;
        }
        if(i<j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      } 
      int temp = arr[low];
      arr[low]= arr[j];
      arr[j] = temp;
      return j;
    }
    public static void main(String args[]){
      int[] arr = {1,9,2,3,8,5,6,4,4,4};
      qs(arr, 0, 9);
      for(int i=0;i<9;i++){
        System.out.print(arr[i]+" ");
      }
    }
  }

