package student; //save this Studentper.java file in folder and compile

public class StudentPer {
    
    public static double calPer(double s[]) {
        double sm = 0;
        for(int i=0; i<6; i++) {
            sm += s[i];
        }
        
        return sm/6;
    }
}
