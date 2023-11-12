
import java.util.Scanner;

class Order {
    int id;
    String desc;
    
    Order() {
        this.id = 0;
        this.desc = "";
    }
}

class PurchaseOrder extends Order {
    String cname;
    
    PurchaseOrder() {
        this.cname = "";
    }
    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Purchase Order Details :");
        System.out.println("Id :");
        id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Description :");
        desc = sc.nextLine();
        
        System.out.println("Customer neme :");
        cname = sc.nextLine();
    }
    
    void display() {
        System.out.println("Purchase Order Details :");
        System.out.println("Id = " + id);
        System.out.println("Description = " + desc);
        System.out.println("Customer neme = " + cname);
    }
}

class SalesOrder extends Order {
    String vname;
    
    SalesOrder() {
        this.vname = "";
    }
    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sale Order Details :");
        System.out.println("Id :");
        id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Description :");
        desc = sc.nextLine();
        
        System.out.println("Vender name :");
        vname = sc.nextLine();
    }
    
    void display() {
        System.out.println("Sale Order Details :");
        System.out.println("Id = " + id);
        System.out.println("Description = " + desc);
        System.out.println("Vender neme = " + vname);
    }
}

public class Slip6Q2 {
    public static void main(String[] name) {
        PurchaseOrder p1 = new PurchaseOrder();
        p1.accept();
        p1.display();
        PurchaseOrder p2 = new PurchaseOrder();
        p2.accept();
        p2.display();
        PurchaseOrder p3 = new PurchaseOrder();
        p3.accept();
        p3.display();
        
        SalesOrder s1 = new SalesOrder();
        s1.accept();
        s1.display();
        SalesOrder s2 = new SalesOrder();
        s2.accept();
        s2.display();
        SalesOrder s3 = new SalesOrder();
        s3.accept();
        s3.display();
    }
}
