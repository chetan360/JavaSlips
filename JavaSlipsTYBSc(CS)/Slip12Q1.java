class College {
    int cno;
    String cname, addr;
    
    College(int cno, String cname, String addr) {
        this.cno = cno;
        this.cname = cname;
        this.addr = addr;
    }
}

class Department extends College {
    int dno;
    String dname;
    
    Department(int cno, String cname, String addr, int dno, String dname){
        super(cno, cname, addr);
        this.dno = dno;
        this.dname = dname;
    }
    
    void display() {
        System.out.println("-------------------------------------------");
        System.out.println("College Details :");
        System.out.println("College No. = " + cno);
        System.out.println("College Name = " + cname);
        System.out.println("College Address = " + addr);
        System.out.println("Department No. = " + dno);
        System.out.println("Department Name = " + dname);
    }
}

public class Slip12Q1 {
    public static void main(String[] args) {
        Department d = new Department(1, "NIT Trichy", "Tamil Nadu", 1, "MCA");
        d.display();
    }
}
