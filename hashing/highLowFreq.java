import java.util.*;
public class highLowFreq{
  public static void main(String args[]){
    //Input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements in the array");
    int n = sc.nextInt();
    System.out.println("Enter the elements of the array");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    // PreFetch
    HashMap<Integer,Integer> mp = new HashMap<>();
    // for(int i=0;i<n;i++){
      // int key = arr[i];
      // int value = 0;
      // mp.put(key,value);
      // if(mp.containsKey(key)) value=mp.get(key); 
      // value++;
      // mp.put(key,value);
    // } 
     for (int i = 0; i < n; i++) {
           mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
    //Compute highest and lowest frequency element
    int maxFreq = 0, minFreq = n;
    int maxEle = 0, minEle = 0;
    for(Map.Entry<Integer,Integer> entry :mp.entrySet()){
      int element = entry.getKey();
      int count = entry.getValue();

      if (count > maxFreq) {
        maxFreq = count;
        maxEle = element;
      }

      if (count < minFreq) {
        minFreq = count;
        minEle = element;
      }    
    }
    System.out.println("The highest frequency element is"+maxEle);
    System.out.println("The lowest frequency element is"+minEle);

  }
}

// import java.util.*;

// class FrequencyCounter {

//     public void Frequency(int[] arr, int n) {
//         Map<Integer, Integer> map = new HashMap<>(); // Stores element -> frequency

//         // Count frequencies
//         for (int i = 0; i < n; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         int maxFreq = 0, minFreq = n;
//         int maxEle = 0, minEle = 0;

//         // Traverse map to find min and max frequency elements
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             int element = entry.getKey();
//             int count = entry.getValue();

//             if (count > maxFreq) {
//                 maxFreq = count;
//                 maxEle = element;
//             }

//             if (count < minFreq) {
//                 minFreq = count;
//                 minEle = element;
//             }
//         }

//         // Print results
//         System.out.println("The highest frequency element is: " + maxEle);
//         System.out.println("The lowest frequency element is: " + minEle);
//     }

//     public static void main(String[] args) {
//         FrequencyCounter fc = new FrequencyCounter();
//         int[] arr = {10, 5, 10, 15, 10, 5};
//         fc.Frequency(arr, arr.length);
//     }
// }
