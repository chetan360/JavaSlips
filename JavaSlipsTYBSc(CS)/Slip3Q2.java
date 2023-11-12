class Patient {
    String pname;
    int age;
    double oxy_level;
    double HCRT_report;
    
    Patient(String pname, int age, double oxy_level, double HCRT_report) {
        this.pname = pname;
        this.age = age;
        this.oxy_level = oxy_level;
        this.HCRT_report = HCRT_report;
    }
    
    void display() {
        System.out.println("----------------------------");
        System.out.println("Patient name = " + pname);
        System.out.println("Age = " + age);
        System.out.println("Oxygen Level = " + oxy_level);
        System.out.println("HCRT report = " + HCRT_report);
    }
}

class CovidPositive extends Exception {
    CovidPositive(String message) {
        super(message);
    }
}

public class Slip3Q2 {
    public static void main(String[] args) {
        try {
            Patient p = new Patient("Aryan", 8, 94.2, 11.2);
            if(p.oxy_level < 95 && p.HCRT_report > 10) {
                throw new CovidPositive("Patient is covide Positive(+) and Need to Hospitalized.");
            }
            p.display();
        } catch (CovidPositive e) {
            System.out.println(e.getMessage());
        }
    }
}
