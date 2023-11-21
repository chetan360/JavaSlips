class Account {
    String cname;
    String accno;
    
    Account() {
        cname = "";
        accno = "";
    }
    
    Account(String cname, String accno) {
        this.cname = cname;
        this.accno = accno;
    }
    
    
}

class SavingAccount extends Account {
    double savingBal;
    double minBal;
    
    SavingAccount(String cname, String accno, double savingBal,
    double minBal) {
        super(cname, accno);
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

class AccountDetail extends SavingAccount {
    double depositamt;
    double withdrawalamt;
    
    AccountDetail(String cname, String accno, double savingBal,
    double minBal, double depositamt, double withdrawalamt) {
        super(cname, accno, savingBal, minBal);
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;
    }
    
    public void displayCustomer() {
        System.out.println("---------------------------------------------");
        System.out.println("Account Details :");
        System.out.println("Customer name = " + cname);
        System.out.println("Account no. = " + accno);
        System.out.println("Saving Ballance = " + savingBal);
        System.out.println("Minimum Ballance = " + minBal);
        System.out.println("Deposit Amoint = " + depositamt);
        System.out.println("Deposit Amoint = " + withdrawalamt);
    }
}

public class Slip15Q2 {
    public static void main(String[] args) {
        AccountDetail a = new AccountDetail("Chetan", "0123456789", 50030000, 50000000, 90000, 100000);
        a.displayCustomer();
    }
}