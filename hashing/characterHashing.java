import java.util.*;
public class characterHashing {
  public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    s = sc.nextLine();
    //pre compute
    int[] hash = new int[26];
    for(int i=0;i<s.length();i++){
      hash[s.charAt(i)-'a']++;
    }
    //input
    System.out.println("Enter the number of queries");
    int q = sc.nextInt();
    System.out.println("Ener the queries");
    char ch;
    while(q--!=0){
      ch = sc.next().charAt(0);
      System.out.println("Frequency= "+hash[ch-'a']); //Fetch
    }
    sc.close();
  }
} 

// If string contains both uppercase and lowercase
//  import java.util.*;

// class characterHashing {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s;
//         s = sc.next();

//         //precompute:
//         int[] hash = new int[256];
//         for (int i = 0; i < s.length(); i++) {
//             hash[s.charAt(i)]++;
//         }

//         int q;
//         q = sc.nextInt();
//         while (q-- > 0) {
//             char c;
//             c = sc.next().charAt(0);
//             // fetch:
//             System.out.println(hash[c]);
//         }
//     }
// }

   

