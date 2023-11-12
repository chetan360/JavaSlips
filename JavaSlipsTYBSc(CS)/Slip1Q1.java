
import java.util.Scanner;

public class Slip1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values :");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int x:arr) {
            int flag = 1;
            for(int i=2; i<=x/2; i++) {
                if(x%i == 0) {
                    flag = 0;
                }
            }
            if(flag == 1) {
                System.out.println(x);
            }
        }
    }
}
