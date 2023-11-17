
import SY.SYMarks;
import TY.TYMarks;
import java.util.Scanner;

class Student {
    public int rno;
    public String name;
    public SYMarks syMarks;
    public TYMarks tyMarks;
    
    Student(int rno, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rno = rno;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }
    
    public double calculatePer() {
        double syPer = (syMarks.ComputerTotal + syMarks.ElectronicsTotal + syMarks.MathsTotal)/3;
        double tyPer = (tyMarks.Practicals = tyMarks.Theory)/2;
        return (syPer + tyPer)/2;
    }
    
    public char Grade() {
        double per = calculatePer();
        
        if(per >= 70) {
            return 'A';
        } else if(per >=60) {
            return 'B';
        } else if(per >= 50) {
            return 'C';
        } else if(per >= 40) {
            return 'D';
        }
        return 'F';
    }
    
    public void result() {
        System.out.println("Student result :");
        System.out.println("Roll no. = " + rno);
        System.out.println("Name = " + name);
        System.out.println("Percentage = " + calculatePer());
        System.out.println("Grade = " + Grade());
        System.out.println("-------------------------------------------------------------------------");
    }
} 

public class Slip14Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("How many Students :");
        n = sc.nextInt();
        
        Student[] s = new Student[n];
        System.out.println("Enter details of " + n + " Students");
        for(int i=0; i<n; i++) {
            int rno;
            String name;
            
            System.out.println("Enter roll no :" );
            rno = sc.nextInt();
            sc.nextLine(); //consume new line before reading string
            
            System.out.println("Enter name of the students :");
            name = sc.nextLine();
            
            double cs, math, elt;
            System.out.println("Enter SY Marks (cs, maths, elt):");
            cs = sc.nextDouble();
            math = sc.nextDouble();
            elt = sc.nextDouble();
            
            double theory, pract;
            System.out.println("Enter TY Marks (theory, pract):");
            theory = sc.nextDouble();
            pract = sc.nextDouble();
            
            s[i] = new Student(rno, name, new SYMarks(cs, math, elt), new TYMarks(theory, pract));
            s[i].result();
        }
    }
}
