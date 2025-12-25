import java.util.*;
class palindromeString{
  public static boolean checkPalindrome(String s,int n,int i){
    if(i>=n/2) return true;
    if(s.charAt(i)!=s.charAt(n-i-1)) return false;
    else{
      return checkPalindrome(s,n,i+1);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String s = sc.next();
    int size = s.length();
    System.out.println(checkPalindrome(s,size,0));
  }
}