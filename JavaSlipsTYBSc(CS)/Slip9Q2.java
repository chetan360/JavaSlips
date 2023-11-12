
import java.io.Serializable;

class Product implements Serializable {
    public int pid;
    public String pname;
    public double cost;
    public int qty;
    
    Product() {
        this.pid = 0;
        this.pname = "";
        this.cost = 0.0;
        this.qty = 0;
    }
    
    Product(int pid, String pname, double cost, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.cost = cost;
        this.qty = qty;
    }
    
    public void display() {
        System.out.println("Product info :");
        System.out.println("Product id = " + pid);
        System.out.println("Product name = " + pname);
        System.out.println("Product cost = " + cost);
        System.out.println("Product quantity = " + qty);
        System.out.println("-----------------------------------------------------");
    }
}

public class Slip9Q2 {
    public static void main(String[] args) {
        int objCount = 0;
        Product p1 = new Product(1, "Mouse", 450.3, 10);
        if(p1 instanceof Serializable) {
            System.out.println("Object count = " + (++objCount));
        }
        p1.display();
        
        Product p2 = new Product(2, "Keyboard", 750.43, 30);
        if(p2 instanceof Serializable) {
            System.out.println("Object count = " + (++objCount));
        }
        p2.display();
        
        Product p3 = new Product(3, "Printer", 3560.3, 5);
        if(p3 instanceof Serializable) {
            System.out.println("Object count = " + (++objCount));
        }
        p3.display();
    }
}
