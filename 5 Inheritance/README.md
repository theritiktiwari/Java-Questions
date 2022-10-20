# Inheritance

**Ques 1 :** Create a class named StudentDetails which has a method named getMarks to collect the particulars of student marks in 5 subjects in an array. Create another class named StudentAverage which computes the average marks using the computeAverage method. This class also has a method named computeGPA which will compute the GPA of the student based on the marks secured. Assume that all the 5 courses are 3 credit courses. If student mark is >=95, give a score of 10. If the mark is >=90 and < 95, give 9. If the mark is >=80 and < 90, give 8. If the mark is >=70 and < 80 give 7. If the mark is >=60 and < 70 give 6. If the mark is >=50 and < 60 give 5. Else give the score as 0. Write a program to compute the student average mark and GPA and print the same.

**Code :**

```java
import java.util.*;

class StudentDetails{
    Scanner sc = new Scanner(System.in);
    int credit = 3, subject = 5;
    int marks[] = new int[subject];
    String name, rollno;

    void getMarks(){
        System.out.print("Enter the Name : ");
        name = sc.next();
        System.out.print("Enter the Roll No : ");
        rollno = sc.next();
        for(int i=0; i<subject; i++){
            System.out.print("Enter the marks of subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
    }
}

class StudentAverage extends StudentDetails{
    void computeAverage(){
        int total = 0;
        for(int i = 0; i < subject; i++){
            total += marks[i];
        }
        System.out.println("The average marks of " + name + " is " + (total / subject));
    }
    void computeGPA(){
        int grade = 0;
        for(int i = 0; i < subject; i++){
            int score = 0;
            if(marks[i] >= 95){
                score = 10;
            }
            else if(marks[i] >= 90 && marks[i] < 95){
                score = 9;
            }
            else if(marks[i] >= 80 && marks[i] < 90){
                score = 8;
            }
            else if(marks[i] >= 70 && marks[i] < 80){
                score = 7;
            }
            else if(marks[i] >= 60 && marks[i] < 70){
                score = 6;
            }
            else if(marks[i] >= 50 && marks[i] < 60){
                score = 5;
            }
            else {
                score = 0;
            }
            grade += score * credit;
        }
        float gpa = (float)(grade / (float)(subject * credit));
        System.out.println("The GPA of " + name + " is " + gpa);
    }
}

public class Main{
    public static void main(String args[]){
        StudentAverage obj = new StudentAverage();
        obj.getMarks();
        obj.computeAverage();
        obj.computeGPA();
    }
}
```

**Ques 2 :** Create a class named BankCustomer that has a method named getCustomerDetails that collects the details such as name, dob, PAN, Aadhar no, address etc. Create two classes namely SavingsAccount and LoanAccount that gets all the customer details from BankCustomer class. The Savings Account class maintains the SB account details of the customer with a unique SB Account number and account balance. Likewise, assume that if the same customer has availed a loan, the LoanAccount maintains the loan details of the customer with a unique Loan Account number, Loan amount and Loan Type. Now, map the PAN and Aadhar of the customer with the respective SB account and Loan Account. Display the SB account number and account balance along with PAN and Aadhar. Likewise Display the loan particulars along with PAN and Aadhar.

**Code :**

```java
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
        sc.close();
    }
}
```

**Ques 3 :** Create a class named FurnitureShop which has a method named getFurnitures that lists the different furnitures sold. The customer selects the furniture he wants to buy from the list. The class also has a method to get the customer details like name, address, phone no, distanceFromShop. Create another class named CustomizeFurniture where there is a method named doCustomization which gets the furniture chosen from the FurnitureShop class and asks the user to enter the type of customization like extra cushion, fine polishing etc. If no customization is needed, just enter nil. Create another class named Transport which has a method named transportCharges which checks if the customer residence is less than 5km from shop. If so there is no transportation charged added. Else include a transportation charge of Rs.500. Write a program to print the Customer name, Furniture Selected, Customization and transportation charge.

**Code :**

```java
import java.util.*;

class FurnitureShop{
    Scanner sc = new Scanner(System.in);
    String name, address, phone, furnitureName;
    int distanceFromShop, furniture;
    void getCustomerDetails(){
        System.out.print("Enter customer name : ");
        name = sc.next();
        System.out.print("Enter customer address : ");
        address = sc.next();
        System.out.print("Enter customer phone : ");
        phone = sc.next();
        System.out.print("Enter distance from shop : ");
        distanceFromShop = sc.nextInt();
    }
    void getFurnitures(){
        System.out.println("1. Chairs");
        System.out.println("2. Tables");
        System.out.println("3. Sofa");
        System.out.print("Enter your choice : ");
        furniture = sc.nextInt();
        furnitureName = (furniture == 1) ? "Chairs" : (furniture == 2) ? "Tables" : (furniture == 3) ? "Sofa" : "No Furniture Selected";
    }
}

class CustomizeFurniture extends FurnitureShop{
    int customize;
    String customizationName;
    void doCustomization(){
        System.out.println("1. Extra Cushion");
        System.out.println("2. Fine Polishing");
        System.out.println("3. Nil");
        System.out.print("Enter your choice : ");
        customize = sc.nextInt();
        customizationName = (customize == 1) ? "Extra Cushion" : (customize == 2) ? "Fine Polishing" : "No Customization";
    }
}

class Transport extends CustomizeFurniture{
    int charges = 0;
    void transportCharges(){
        if(distanceFromShop > 5)
            charges = 500;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Furniture Name : " + furnitureName);
        System.out.println("Customization Name : " + customizationName);
        if(charges != 0)
            System.out.println("Transportation Charges : " + charges);
        else
            System.out.println("No Transportation Charges");
    }
}

public class Main{
    public static void main(String args[]){
        Transport t = new Transport();
        t.getCustomerDetails();
        t.getFurnitures();
        t.doCustomization();
        t.transportCharges();
        t.display();
    }
}
```
