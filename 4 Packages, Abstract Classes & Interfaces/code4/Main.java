import java.util.*;

abstract class Bank {
    String name;
    int account_number, account_open_year, age, average_yearly_balance;
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public void getCustomerDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Customer : ");
        name = sc.nextLine();
        System.out.print("Enter the age of Customer : ");
        age = sc.nextInt();
        System.out.print("Enter the account number of Customer : ");
        account_number = sc.nextInt();
        System.out.print("Enter the account opening year : ");
        account_open_year = sc.nextInt();
        System.out.print("Enter the average yearly balance : ");
        average_yearly_balance = sc.nextInt();
    }

    public void display(){
        System.out.println("Name of Customer : " + name);
        System.out.println("Age of Customer : " + age);
        System.out.println("Account number of Customer : " + account_number);
        System.out.println("Account opening year of Customer : " + account_open_year);
        System.out.println("Average yearly balance of Customer : " + average_yearly_balance);
    }

    abstract void checkPreviligeCustomer(int a, int y);
}

class Bank1 extends Bank {
    void checkPreviligeCustomer(int a, int y){
        if(a >= 100000 && (year - y) > 5)
            System.out.println("Privilage Customer");
        else
            System.out.println("Non Privilage Customer");
    }
}

class Bank2 extends Bank {
    void checkPreviligeCustomer(int a, int y){
        if(a >= 200000 && (year - y) > 5)
            System.out.println("Privilage Customer");
        else
            System.out.println("Non Privilage Customer");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Bank 1");
            System.out.println("2. Bank 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    Bank1 b1 = new Bank1();
                    b1.getCustomerDetails();
                    b1.display();
                    b1.checkPreviligeCustomer(b1.average_yearly_balance, b1.account_open_year);
                    break;
                case 2:
                    Bank2 b2 = new Bank2();
                    b2.getCustomerDetails();
                    b2.display();
                    b2.checkPreviligeCustomer(b2.average_yearly_balance, b2.account_open_year);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 3);
    }
}