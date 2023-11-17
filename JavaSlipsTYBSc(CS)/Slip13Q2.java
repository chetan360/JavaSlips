
import java.text.SimpleDateFormat;
import java.util.Date;

public class Slip13Q2 {
    public static void main(String[] args) {
        Date currDate = new Date();
        
        //format 1: dd/MM/yyyy
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + format1.format(currDate));
        
        //format 2: MM-dd-yyyy
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + format2.format(currDate));
        
        //format 3: EEEE MMMM dd yyyy 
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + format3.format(currDate));
        
        //format 4: EEE MMM dd HH:mm:ss z yyyy
        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        System.out.println("Current date is : " + format4.format(currDate));
        
        //format 5: dd/MM/yy HH:mm:ss a Z
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date is : " + format5.format(currDate));    
    }
}
