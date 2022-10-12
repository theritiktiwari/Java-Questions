import java.util.*;

class BankCustomer {
    String name, dob, PAN;
    int aadhar;

    Scanner sc = new Scanner(System.in);
    void getCustomerDetails(){
        System.out.print("Enter the name of the customer : ");
        name = sc.next();
        System.out.print("Enter the date of birth of the customer : ");
        dob = sc.next();
        System.out.print("Enter the aadhar number of the customer : ");
        aadhar = sc.nextInt();
        System.out.print("Enter the PAN number of the customer : ");
        PAN = sc.next();
    }
}

class SavingsAccount extends BankCustomer {
    int balance, accno;
    SavingsAccount(){
        getCustomerDetails();
        System.out.print("Enter the account number of the customer : ");
        accno = sc.nextInt();
        System.out.print("Enter the balance of the customer : ");
        balance = sc.nextInt();
    }
    void displayCustomerDetails(){
        System.out.println("Name : " + name);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Account Number : " + accno);
        System.out.println("balance : " + balance);
        System.out.println("Aadhar Number : " + aadhar);
        System.out.println("PAN Number : " + PAN);
    }
}

class LoanAccount extends BankCustomer {
    int loan, loanAccNum;
    String loanType;

    LoanAccount(){
        getCustomerDetails();
        System.out.print("Enter the loan account number of the customer : ");
        loanAccNum = sc.nextInt();
        System.out.print("Enter the loan amount of the customer : ");
        loan = sc.nextInt();
        System.out.print("Enter the loan type of the customer : ");
        loanType = sc.next();
    }
    void displayCustomerDetails(){
        System.out.println("Name : " + name);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Loan Account Number : " + loanAccNum);
        System.out.println("Loan Amount : " + loan);
        System.out.println("Loan Type : " + loanType);
        System.out.println("Aadhar Number : " + aadhar);
        System.out.println("PAN Number : " + PAN);
    }
}
public class Main{
    public static void main(String args[]){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Savings Account");
            System.out.println("2. Loan Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    SavingsAccount sa = new SavingsAccount();
                    sa.displayCustomerDetails();
                    break;
                case 2:
                    LoanAccount la = new LoanAccount();
                    la.displayCustomerDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using our services");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 3);
    }
}