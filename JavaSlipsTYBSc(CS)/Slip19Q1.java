
import java.util.Scanner;

public class Slip19Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][2];
        
        System.out.println("Enter 2x2 mat elts :");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        int trace = 0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                if(i == j) {
                    trace += A[i][j];
                }
            }
        }
        
        System.out.println("Sum of digonal elt = " + trace);
    }
}
