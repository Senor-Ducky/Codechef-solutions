import java.util.Scanner;

class LUCKFOUR {
    public static void main(String[] args) {
        int t,n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int[] arr = new int[t];

        while(t > 0) {
            n = sc.nextInt();

            for(int i=0; i<arr.length; i++) {
                if(arr[i]==4) {
                    count++;
                }
            }

            System.out.println(count);
            t--;
        }

            
            
        }
    }

