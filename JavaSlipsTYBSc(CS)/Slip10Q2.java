import java.util.Scanner;
import student.StudentInfo;
import student.StudentPer;

public class Slip10Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Details of student:");
        System.out.println("Roll no. :");
        int rno = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Name :");
        String name = sc.nextLine();
        
        System.out.println("Class :");
        String Class = sc.nextLine();
        
        System.out.println("Marks of 6 subjects :");
        double[] s = new double[6];
        for(int i=0; i<6; i++) {
            s[i] = sc.nextDouble();
        }
        
        double per = StudentPer.calPer(s);
        
        StudentInfo stud = new StudentInfo(rno, name, Class, per);
        stud.display();
    }
}
