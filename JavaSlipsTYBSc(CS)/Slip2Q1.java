class BMI {
    String fName;
    String lName;
    double w;
    double h;
    
    BMI(String fName, String lName, double w, double h) {
        this.fName = fName;
        this.lName = lName;
        this.w = w;
        this.h = h;
    }
    
    double calBMIIdx() {
        return w/(h*h);
    }
    
    void display() {
        System.out.println("-----------------------------");
        System.out.println("Frist name = " + fName);
        System.out.println("Last name = " + lName);
        System.out.println("Height = " + h);
        System.out.println("Weight = " + w);
        System.out.println("BMI Index = " + this.calBMIIdx());
    }
}

public class Slip2Q1 {
    public static void main(String[] args) {
        String fName = args[0];
        String lName = args[1];
        double w = Double.parseDouble(args[2]);
        double h = Double.parseDouble(args[3]);
        BMI p = new BMI(fName, lName, w, h);
        p.display();
    }
}
