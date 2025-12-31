import java.util.Scanner;
class HashingBasic{
  public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total numbers of elements in array");
    n=sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
      System.out.println("Enter the "+(i+1)+" element");
      arr[i] = sc.nextInt();
    }
    // PRE COMPUTE
    int[] hash= new int[13];
    for(int i=0;i<n;i++){
      hash[arr[i]]+=1;
    }
    //PRE FETCH
    int q;
    System.out.println("Enter the total number of queries");
    q = sc.nextInt();
    while(q-- !=0){
      int number;
      System.out.println("Enter the queries");
      number=sc.nextInt();
      System.out.println("Frequency="+hash[number]);
    }
    sc.close();
  }
}