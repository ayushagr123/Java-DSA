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
    String query;
    while(q--!=0){
      query = sc.next();
      System.out.println("Frequency= "+hash[query.charAt(0)-'a']); //Fetch
    }
    sc.close();
  }
} 
   

