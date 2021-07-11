import java.util.Scanner;

class first {
    int firstdigit(int n) {
        while(n>=10) {
            n=n/10;
        
        }
        return n;
    }

    int lastdigit(int n) {
        return (n%10);
    }
}
    







public class FLOW004 {
    public static void main(String[] args) {
        int t,n;
        
        first f = new first();
        

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i=0; i<t; i++) {
            n = sc.nextInt();

            System.out.println(f.firstdigit(n) + f.lastdigit(n));
        }
        sc.close();
    }
}

