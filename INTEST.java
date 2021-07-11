import java.util.Scanner;

class INTEST {
    public static void main(String[] args) {
        int n, k, number;
        int count=0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        

        for(int i = 0; i<n; i++) {
            number = sc.nextInt();

            if(number%k == 0) {
                    count++;
                }
            }
        System.out.println(count);
        sc.close();
        
    }
}