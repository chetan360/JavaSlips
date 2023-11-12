class Employee {
    int id;
    String name;
    String designation;
    int sal;
    
    Employee(int id, String name, String designation, int sal) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.sal = sal;
    }
    
    public String toString() {
        return "ID = " + id +
               "\nName = " + name +
               "\nDesigination = " + designation + 
               "\nSalary = " + sal; 
    }
}

public class Slip6Q1 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Chetan", "CEO", 200000000);
        System.out.println(e.toString());
    }
}
