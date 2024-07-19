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

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(binoCoffie(5, 2));

    }
}
