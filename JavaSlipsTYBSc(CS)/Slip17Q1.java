
import java.util.Scanner;

class Customer {
    String name;
    String phoneNumber;
    
    Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Depositor extends Customer {
    String accNo;
    double balance;
    Depositor(String name, String phoneNumber, String accNo,
    double balance) {
        super(name, phoneNumber);
        this.accNo = accNo;
        this.balance = balance;
    }
}

class Borrower extends Depositor {
    String loanNo;
    double loanAmt;
    Borrower(String name, String phoneNumber, String accNo,
    double balance, String loanNo, double loanAmt) {
        super(name, phoneNumber, accNo, balance);
        this.loanNo = loanNo;
        this.loanAmt = loanAmt;
    }
    
    void display() {
        System.out.println("--------------------------------------");
        System.out.println("Name = " + name);
        System.out.println("Phone no. = " + phoneNumber);
        System.out.println("Account no. = " + accNo);
        System.out.println("Balance = " + balance);
        System.out.println("Loan no. = " + loanNo);
        System.out.println("Loan Amount = " + loanAmt);
    }
}

public class Slip17Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How namy Borrowers :");
        int n = sc.nextInt();
        Borrower[] b = new Borrower[n];
        for(int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Enter name :");
            String name = sc.nextLine();
            
            System.out.println("Enter phone no. :");
            String phoneNo = sc.nextLine();
            
            System.out.println("Enter account no. :");
            String accNo = sc.nextLine();
            
            System.out.println("Enter ballance :");
            double balance = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Enter loan no. :");
            String loanNo = sc.nextLine();
            
            System.out.println("Enter loan amount :");
            double loanAmt = sc.nextDouble();
            
            b[i] = new Borrower(name, phoneNo, accNo, balance, loanNo, loanAmt);
        }
        
        for(Borrower x:b) {
            x.display();
        }
    }
}
