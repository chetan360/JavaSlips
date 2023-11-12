package student; //save this StudentInfo.java file in folder and compile

public class StudentInfo {
    public int rno;
    public String Class, name;
    public double per;
    
    public StudentInfo(int rno, String name, String Class, double per) {
        this.rno = rno;
        this.name = name;
        this.Class = Class;
        this.per = per;
    }
    
    public void display() { 
        System.out.println("-------------------------");
        System.out.println("Student info:");
        System.out.println("Roll no. = " + rno);
        System.out.println("Name = " + name);
        System.out.println("Class = " + Class);
        System.out.println("Percentage = " + per);
    }
}