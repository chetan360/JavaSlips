
import Operation.Addition;//create folder operation add save Addition.class, Maximum
import Operation.Maximum;

public class Slip20Q2 {
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        System.out.println("6 + 4  = " + obj1.add(6f, 4f) );
        System.out.println("6 - 4  = " + obj1.sub(6f, 4f) );
        
        Maximum obj2 = new Maximum();
        System.out.println("Max(100, 2) = " + obj2.max(100, 2));
    }
}
