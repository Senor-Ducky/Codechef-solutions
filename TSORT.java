import java.util.*;

class TSORT {
    public static void main(String[] args) {
        int t;
        
        
        Scanner sc = new Scanner(System.in);

        t= sc.nextInt();
        int[] arr = new int[t];
        

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        Arrays.sort(arr);

        for(int j=0; j<arr.length; j++) {
            System.out.println(arr[j]);
        }
        
    }
}
