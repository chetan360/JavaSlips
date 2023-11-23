class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;
    
    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean isValidDate(int day, int month, int year) {
        if(day < 0 || month < 0 || month >= 12 || year < 1900) {
            return false;
        }
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(month == 2 && day == 29 && year%4 == 0 && year%100 != 0 || year%400 == 0) {
                return true;
        } else if(day > daysInMonth[month]) {
            return false;
        }
        
        return true;
    }
}

public class Slip21Q1 {
    public static void main(String[] args) {
        MyDate date = new MyDate(3, 53, 2003);
        try {
            if(date.isValidDate(date.day, date.month, date.year)) {
                System.out.println("Valid date : " + date.day + ":" + date.month + ":" +date.year);
            } else {
                throw new InvalidDateException("Date is invalid.");
            }
        } catch(InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
