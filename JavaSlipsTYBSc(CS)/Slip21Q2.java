class Employee2 {
    int id;
    String name, deptName;
    double salary;
    static int count = 0;
    
    Employee2() {
        this.id = 0;
        this.name = "";
        this.deptName = "";
        this.salary = 0.0;
        count++;
        displayObjCount();
    }
    
    Employee2(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++;
        displayObjCount();
    }
    
    public static void displayObjCount() {
        System.out.println("Object count = " + count);
    }
    
    public void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department Name = " + deptName);
        System.out.println("Salary = " + salary);
        System.out.println("--------------------------------------------------------");
    }
}

public class Slip21Q2 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1, "Chetan", "DSA", 50000000);
        e1.display();
        Employee2 e2 = new Employee2(2, "Sumit", "CS", 70000000);
        e2.display();
    }
}
