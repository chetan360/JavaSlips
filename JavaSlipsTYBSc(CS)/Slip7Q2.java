
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Slip7Q2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name :");
        String fname = sc.nextLine();
        sc.close();
        
        BufferedReader r = new BufferedReader(new FileReader(fname));
        
        StringBuilder str = new StringBuilder();
        String line;
        while((line = r.readLine()) != null) {
            str.append(line.toLowerCase()).append("\n");
        }
        
        str.reverse();
        
        System.out.println("File contents in reverse order : ");
        System.out.println(str);
    }
}
