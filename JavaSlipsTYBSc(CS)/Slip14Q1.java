
import java.util.Scanner;

class Zero extends Exception {
    Zero(String message) {
        super(message);
    }
}

public class Slip14Q1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            
            if(n == 0) {
                throw new Zero("Number is 0.");
            } else {
                int flag = 1;
                for(int i=2; i<=n/2; i++) {
                    if(n%i == 0) {
                        flag = 0;
                    } 
                }
                if(flag == 1) {
                    System.out.println(n + " is prime number.");
                } else {
                    System.out.println(n + " is not prime number.");
                }
            }
        } catch(Zero e) {
            System.out.println(e.getMessage());
        }
    }
}
