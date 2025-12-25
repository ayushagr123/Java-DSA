import java.util.Collections;
public class pattern1 {
    public static void square(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=1;j<=2*n;j++){
                if(j>=(n-i+1) && j<=(n+i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=(n-1);i>=0;i--){
            for(int j=1;j<=2*n;j++){
                if(j>=(n-i+1) && j<=(n+i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
       public static void alphaTriangle(int n) {
        // Write your code here
        char ch='A';
        for(int x=1;x<n;x++){
           ch++;
        }
        for(int i=0;i<n;i++){
          char ch2=ch;
            for(int j=0;j<=i;j++){
                System.out.print(ch2+" ");
                ch2--;
            }
            System.out.println();
        }
    }

   
    public static void symmetry(int n) {
       // Write your code here
       for(int i=1;i<=2*n-1;i++){
            int k=i;
            if(k>n) k-=2*(i-n);
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*n-2*k);j++){
                System.out.print( "  ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void getStarPattern(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==(n-i))
            }

        }
    }


    public static void complexpattern(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left = j;
                int right=2*n-2-j;
                int bottom = 2*n-2-i;
                int val=min(min(top,left),min(right,bottom));
                System.out.print(n-val);
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
      int n=7;
      complexpattern(n);
    }
}