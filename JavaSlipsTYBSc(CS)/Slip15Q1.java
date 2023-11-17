
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Slip15Q1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Source file name :");
        String f1 = sc.nextLine();
        System.out.println("Enter Destination file name :");
        String f2 = sc.nextLine();
        sc.close();
        
        BufferedReader r = new BufferedReader(new FileReader(f1));
        PrintWriter w = new PrintWriter(new FileWriter(f2));
        
        String line;
        while((line = r.readLine()) != null) {
            w.println(line);
        }
        r.close();
        w.close();
        
        System.out.println("File content copied");
    }
}