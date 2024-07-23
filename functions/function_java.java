import java.util.*;

public class function_java {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        ;
        return f;
    }

    public static int binoCoffie(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binoCoffie = fact_n / (fact_r * (fact_nmr));
        return binoCoffie;
    }

    public static boolean primeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // System.out.println("not prime");
                return false;
            }
        }
        // System.out.println("prime");

        return true;
    }
    public static void primeRange(int n){
        for (int i = 2; i <= n; i++) {
            if(primeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(factorial(4));
        // System.out.println(binoCoffie(5, 2));
        // System.out.println(primeNumber(2));
        // primeRange(20);
    }
}
