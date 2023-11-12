
import java.util.Arrays;
import java.util.Scanner;

public class Slip3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many city names : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] cities = new String[n];
        System.out.println("Enter " + n + " names of cities :");
        for(int i=0; i<n; i++) {
            cities[i] = sc.nextLine();
        }
        
        Arrays.sort(cities);
        
        System.out.println("After sorting city names :");
        for(String name:cities) {
            System.out.println(name);
        }
    }
}
