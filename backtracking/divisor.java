public class divisor {
    public void div(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
              int j=0;
              if(i==j){break;}
                j=n/i;
                System.out.print(i + " "+j);
            }
        }
    }
    // To check prime number
    public boolean prime(int n){
    }

    // FIXED: Added String[] args
    public static void main(String args[]) { 
        int n=78;
        divisor obj = new divisor();
        obj.div(n);
    }
}
