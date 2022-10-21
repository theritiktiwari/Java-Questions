import java.util.*;

public class code8 {
    String Name, accountType;
    int age, identity, balance;

    public void withdraw(int amount) {
        if (balance < amount)
            System.out.println("Insufficient Balance");
        else {
            balance -= amount;
            System.out.println(amount + " Withdrawaled");
        }
        System.out.println("Balance: " + balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " Desposited");
        System.out.println("Balance: " + balance);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        Name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Identity (Aadhar/PAN) : ");
        identity = sc.nextInt();
        System.out.print("Enter Account Type : ");
        accountType = sc.next();
        System.out.print("Enter Balance : ");
        balance = sc.nextInt();
    }

    public void display() {
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Identity : " + identity);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }

    public static void main(String args[]) {
        code8 c = new code8();
        c.input();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw : ");
                    int amount1 = sc.nextInt();
                    c.withdraw(amount1);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    int amount2 = sc.nextInt();
                    c.deposit(amount2);
                    break;
                case 3:
                    c.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}