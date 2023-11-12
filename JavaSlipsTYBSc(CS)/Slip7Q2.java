
import java.io.IOException;
import java.io.RandomAccessFile;

public class Slip7Q2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("text.txt", "r");
        StringBuffer str = new StringBuffer();
        long curr = file.getFilePointer();
        file.seek(0);
        
        while(file.getFilePointer() < file.length()) {
            String line = file.readLine();
            str.append(line.toLowerCase()).append("\n");
        }
        
        str.reverse();
        
        System.out.println("File content in reverse order :");
        System.out.println(str);
        
        file.seek(curr);
    }
}