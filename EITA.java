import java.util.*;

class EITA {
    static int first_approach(int x) {
        int work=0;
        
        work = x*7;
        

        return work;
        
    }

    static int second_approach(int d, int y, int z) {
        int remaining_days = 7-d;
        int work = 0;

        if(remaining_days+d <= 7) {
            work = y*d + z*remaining_days;
        }

        return work;
    }

    public static void main(String[] args) {
        int t, d, x, y,z;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i=0; i<t; i++) {
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            int result1 = first_approach(x);
            int result2 = second_approach(d, y, z);

            System.out.println(Math.max(result1, result2));

        }
    }
}
