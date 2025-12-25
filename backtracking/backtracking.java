import java.util.Scanner;
public class backtracking {
  public static void printNumbers(int n,int i){
    if(i>n){
      return;
    }
  printNumbers(n,i+1);
  System.out.println(i);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer");
    int n = sc.nextInt();
    printNumbers(n,1);
  }
}
