import java.math.BigInteger;
import java.util.*;

class FCTRL2 {

    static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");

        for(int i = 1; i<=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            
        }
        return fact;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i=0; i<t; i++) {
            n = sc.nextInt();
            System.out.println(factorial(n));
        }
    }


}
