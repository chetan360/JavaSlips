class Bank {
    long ballance = 0;
    long accNo;
    String accHolderName;
    String accType;
    
    Bank(int accNo, String accHolderName, String accType) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
        if(accType.equalsIgnoreCase("Saving")) {
            this.ballance = 0;
        } else {
            //current
            this.ballance = 500;
        }
    }
    
    void deposit(long amt) {
        ballance += amt;
    }
    
    void withdraw(long amt) {
        ballance -= amt;
    }
    
    void display() {
        System.out.println("-----------------------------------------");
        System.out.println("Account Details :");
        System.out.println("Account Number = " + accNo);
        System.out.println("Account Holder Name " + accHolderName);
        System.out.println("Account Ballance = " + ballance);
    }
}

public class Slip7Q1 {
    public static void main(String[] args) {
        Bank a = new Bank(123, "Chetan", "Current");
        a.deposit(50000000);
        a.withdraw(200000);
        a.display();
    }
}
