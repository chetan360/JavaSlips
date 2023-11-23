
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Slip13Q1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = args[0];
        
        BufferedReader b = new BufferedReader(new FileReader(fileName));
        
        String[] words;
        int wCnt=0, lCnt=0;
        String line;
        while((line = b.readLine()) != null) {
            lCnt++;
            words = line.split("\\s");
            wCnt += words.length;
        }
        
        System.out.println("No. of lines = " + lCnt);
        System.out.println("No. of Words = " + wCnt);
    }
}
