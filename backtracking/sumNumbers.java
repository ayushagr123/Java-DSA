//PARAMETRISED WITHOUT BACKTRACKING

import java.util.Scanner;
// public class sumNumbers {
//   public static void numbers(int i,int sum,int n){
//     if(i>n) {
//       System.out.println("Sum is "+sum);
//       return;
//     } 
//     numbers(i+1,sum+i,n);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of n");
//     int n=sc.nextInt();
//     numbers(0,0,n);
//   }
// }



// PARAMETRISED WITH BACKTRACKING 
public class sumNumbers{
  static void sum(int i,int sum){
    if(i<1){
      System.out.println(sum);
      return;
    }
    sum(i-1,sum+i);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    sum(n,0);
  }
}

//FUNCTIONAL WAY
// public class sumNumbers {
//   static int sum(int n){
//     if(n==0) return 0;
//     else return(n+sum(n-1));
//   }
//   public static void main(String args[]){
//     int n=5;
//     System.out.println(sum(n));
//   }
// }
