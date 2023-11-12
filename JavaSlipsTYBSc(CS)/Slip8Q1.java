class Sphere {
    private double pi = 3.14;
    double r;
    
    Sphere(double r) {
        this.r = r;
    }
    
    double surfaceArea() {
        return 4 * pi*(r*r);
    }
    
    double volume() {
        return (4/3)*pi*(r*r*r);
    }
}

public class Slip8Q1 {
    public static void main(String[] args) {
        Sphere p = new Sphere(5.3);
        System.out.println("Surface area = " + p.surfaceArea());
        System.out.println("Volume = " + p.volume());
    }
}
