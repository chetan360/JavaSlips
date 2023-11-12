class Clock {
    int hh, mm, ss;
    String mode;
    
    Clock(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
    
    boolean isValid() {
        if(hh > 12) {
            hh -= 12;
            mode = "PM";
        } else {
            mode = "AM";
        }
        
        return ((hh >= 0 && hh <= 12) && (mm >= 0 && mm <= 60) && (ss >= 0 && ss <= 60));
    }
}

public class Slip9Q1 {
    public static void main(String[] args) {
        Clock c = new Clock(9, 40, 50);
        if(c.isValid()) {
            System.out.println(c.hh + ":" + c.mm + ":" + c.ss + " " + c.mode + " is a valid time.");
        } else {
            System.out.println(c.hh + ":" + c.mm + ":" + c.ss + " " + c.mode + " is not a valid time.");
        }
    }
}
