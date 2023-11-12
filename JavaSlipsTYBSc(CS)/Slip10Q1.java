interface Cube {
    abstract public int cube(int n); 
}

public class Slip10Q1 implements Cube {
    public int cube(int n) {
        return n*n*n;
    }
    
    public static void main(String[] args) {
        Slip10Q1 n = new Slip10Q1();
        System.out.println("Cube of  3 is " + n.cube(3));
    }
}
