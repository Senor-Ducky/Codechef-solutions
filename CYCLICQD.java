import java.util.*;

class CYCLICQD {

    static int check_quadrilateral(int a, int b, int c, int d) {
        int flag;
        if(a+c == 180 || b+d == 180 ) {
            flag =1;
        } else {
            flag =0;
        }
        return flag;
    }
    public static void main(String args[]) {
        int t, a, b, c, d;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i=0; i<t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            int response = check_quadrilateral(a, b, c, d);

            if(response == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}