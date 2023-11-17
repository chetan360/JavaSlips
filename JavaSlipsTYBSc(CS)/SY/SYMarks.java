//create class file using javac
//pase it into SY folder
//TY folder must be in your project folder
package SY;

public class SYMarks {
    public double ComputerTotal;
    public double MathsTotal;
    public double ElectronicsTotal;
    
    public SYMarks(double ComputerTotal, double MathsTotal, double ElectronicsTotal) {
        this.ComputerTotal = ComputerTotal;
        this.ElectronicsTotal = ElectronicsTotal;
        this.MathsTotal = MathsTotal; 
    }
}
