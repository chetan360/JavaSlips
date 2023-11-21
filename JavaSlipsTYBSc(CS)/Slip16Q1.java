interface Square {
    abstract public int square(int n);
}

public class Slip16Q1 implements Square {
    public int square(int n) {
        return n*n;
    }
    
    public static void main(String[] args) {
        Slip16Q1 obj = new Slip16Q1(); 
        System.out.println(obj.square(7));
    }
}
