
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Slip13Q1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name :");
        String fname = sc.nextLine();
        sc.close();
        
        BufferedReader r = new BufferedReader(new FileReader(fname));
        
        String[] words;
        String line;
        int lCount=0, wCount=0;
        while((line = r.readLine()) != null) {
            lCount++;
            words = line.split("\\s");
            wCount += words.length;
        }
        
        System.out.println("No. of Lines = " + lCount);
        System.out.println("No. of Words = " + wCount);
    }
}
