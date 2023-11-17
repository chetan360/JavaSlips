
import java.io.IOException;
import java.io.RandomAccessFile;

public class Slip13Q1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile(args[0], "r");
        long curr = file.getFilePointer();
        file.seek(0);
        
        int lCount=0, wCount=0;
        String[] words;
        while(file.getFilePointer() < file.length()) {
            lCount++;
            words = file.readLine().split("\\s");
            wCount += words.length;
        }
        System.out.println("No. of Lines = " + lCount);
        System.out.println("No. of Words = " + wCount);
        
        file.seek(curr);
    }
}