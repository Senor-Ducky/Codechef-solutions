import java.util.Scanner;

class RELATIVE {
    
    static int speed(int g, int c) {
        int relative_speed = (c*c)/(2*g);

        return relative_speed;

        
    }

    public static void main(String[] args) {
        int t,g,c;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            g = sc.nextInt();
            c = sc.nextInt();

            System.out.println(speed(g, c));
        }
    }

}
