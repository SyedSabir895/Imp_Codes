public class Fib {
    public static void FibonacciSeries(int n){
        double a = 1;
        double b = 2;
        if(n==1){
            System.out.println(a);
        }
        else if (n==2){
            System.out.println(a + " " + b);
        }
        else{
                        System.out.println(a + " " + b + " ");

            for(int i=3;i<=n;i++){
                double nextno = a+b;
                System.out.println(nextno + " ");
                a = b;
                b = nextno;
            }
        }
    }
}
