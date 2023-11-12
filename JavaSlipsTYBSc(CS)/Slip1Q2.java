
import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;
    
    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff{
    String dept;
    OfficeStaff(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }
    
    void display() {
        System.out.println("----------------------------");
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department = " + dept);
    }
}

public class Slip1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many Staff members :");
        int n = sc.nextInt();
        
        OfficeStaff[] s = new OfficeStaff[n];
        System.out.println("Entet " + n + " Staff members details :");
        for(int i=0; i<n; i++) {
            System.out.println("Id :");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Name :");
            String name = sc.nextLine();
            
            System.out.println("Department :");
            String dept = sc.nextLine();
            
            s[i] = new OfficeStaff(id, name, dept);
        }
        
        for(OfficeStaff x:s) {
            x.display();
        }
    }
}
