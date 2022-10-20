# Packages, Abstract Classes & Interfaces

**Ques 1 :** Within the package named 'primepackage', define a class PrimeNum which includes a method checkForPrime() for checking if the given number is prime or not. Get the two numbers from user. Define another class named TwinPrimeNum outside this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimeNum class should make use of the checkForPrime() method in the PrimeNum class.

**Code :**

```java
package primepackage;
import java.util.*;

public class PrimeNum {
    public boolean checkForPrime(int num){
        if (num == 1)
            return false;
        int i, flag = 0;
        for(i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            return true;
        else
            return false;
    }
}
```

```java
package TwinPrimeNum;
import primepackage.*;
import java.util.*;

public class TwinPrimeNum {
    public static void main(String args[]){
        PrimeNum p = new PrimeNum();
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();

        for(int i = num1; i <= num2; i++){
            if(p.checkForPrime(i) && p.checkForPrime(i+2))
                System.out.println(i + " " + (i+2));
        }
    }
}
```

**Ques 2 :** Define an abstract class ‘Themepark’ and inherit two classes ‘ThemePark1’ and ‘ThemePark2’ from the abstract class. In both the theme parks, the details of visitor such as name, age, gender, city, swimming (Y/N) are collected using a member method in the abstract class. Create a menu listing the ThemeParks 1 and 2. If the user enters 1, theme park1 is selected and processed further. If the user enters 2, theme park2 is selected and processed. Also, declare an abstract method playDiving(int a, boolean s) which must be redefined in the subclasses. In ThemePark1, the adults are allowed to play diving if the age >=18 and the adults know swimming. In ThemePark2, the adults are allowed to play diving if the age >=21 and the adults know swimming. Implement the logic to check if the person can play diving in the respective child classes based on the rule specified above. Display the visitor details and let know if the visitor is eligible for diving in the respective themepark selected by the visitor.

**Code :**

```java
import java.util.*;

abstract class ThemePark {
    String name, gender, city, swim;
    int age;
    boolean isSwim;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Visitor : ");
        name = sc.nextLine();
        System.out.print("Enter the age of Visitor : ");
        age = sc.nextInt();
        System.out.print("Enter the gender of Visitor : ");
        gender = sc.next();
        System.out.print("Enter the city of Visitor : ");
        city = sc.next();
        System.out.print("Visitor can swim ? (Y/N) : ");
        swim = sc.next();
    }
    public void set(){
        if(swim.equals("Y") || swim.equals("y"))
            isSwim = true;
        else
            isSwim = false;
    }
    public void display(){
        System.out.println("Name of Visitor : " + name);
        System.out.println("Age of Visitor : " + age);
        System.out.println("Gender of Visitor : " + gender);
        System.out.println("City of Visitor : " + city);
    }
    abstract void playDiving(int a, boolean s);
}

class ThemePark1 extends ThemePark {
    void playDiving(int a, boolean s){
        if(a >= 18 && s == true)
            System.out.println("You can play diving");
        else
            System.out.println("You can't play diving");
    }
}

class ThemePark2 extends ThemePark {
    void playDiving(int a, boolean s){
        if(a >= 21 && s == true)
            System.out.println("You can play diving");
        else
            System.out.println("You can't play diving");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Theme Park 1");
            System.out.println("2. Theme Park 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ThemePark1 tp1 = new ThemePark1();
                    tp1.input();
                    tp1.set();
                    tp1.display();
                    tp1.playDiving(tp1.age, tp1.isSwim);
                    break;
                case 2:
                    ThemePark2 tp2 = new ThemePark2();
                    tp2.input();
                    tp2.display();
                    tp2.playDiving(tp2.age, tp2.isSwim);
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
```

**Ques 3 :** Create an interface named ThemePark. The themepark interface has a method named getVisitorDetails() to fetch the visitor details such as name, age, gender, city, swimming (Y/N). It has another method named playDiving(int a, boolean s) that takes the age and swimming known (Y/N) status as input. Create two classes named ‘ThemePark1’ and ‘ThemePark2’ that uses the ThemePark interface and uses the same to get visitor details and to check whether the visitor can do diving. ThemePark2 has few other watersports as well for which knowing to swim and age >=21 is the eligiblity criteria. Create a member method named playWatersports(int a, boolean s) inside ThemePark2 class to accomodate this. Create a menu listing the ThemeParks 1 and 2. If the user enters 1, theme park1 is selected and processed further. If the user enters 2, theme park2 is selected and processed. Display the visitor details and let know if the visitor is eligible for diving if theme park1 is selected and to display the visitor details and eligibility to dive and play watersports if theme park2 is selected.

**Code :**

```java
import java.util.*;

class Base {
    String name, gender, city, swim;
    int age;
    boolean isSwim;

    public void set(){
        if(swim.equals("Y") || swim.equals("y"))
            isSwim = true;
        else
            isSwim = false;
    }
    public void display(){
        System.out.println("Name of Visitor : " + name);
        System.out.println("Age of Visitor : " + age);
        System.out.println("Gender of Visitor : " + gender);
        System.out.println("City of Visitor : " + city);
    }
}

interface ThemePark{
    void getVisitorDetails();
    void playDiving(int a, boolean s);
}

class ThemePark1 extends Base implements ThemePark {
    public void getVisitorDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Visitor : ");
        name = sc.nextLine();
        System.out.print("Enter the age of Visitor : ");
        age = sc.nextInt();
        System.out.print("Enter the gender of Visitor : ");
        gender = sc.next();
        System.out.print("Enter the city of Visitor : ");
        city = sc.next();
        System.out.print("Visitor can swim ? (Y/N) : ");
        swim = sc.next();
    }

    public void playDiving(int a, boolean s){
        if(a >= 18 && s == true)
            System.out.println("You can play diving");
        else
            System.out.println("You can't play diving");
    }
}

class ThemePark2 extends ThemePark1 implements ThemePark {
    public void playWatersports(int a, boolean s){
        if(a >= 21 && s == true)
            System.out.println("You can play water sports");
        else
            System.out.println("You can't play water sports");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Theme Park 1");
            System.out.println("2. Theme Park 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ThemePark1 tp1 = new ThemePark1();
                    tp1.getVisitorDetails();
                    tp1.set();
                    tp1.display();
                    tp1.playDiving(tp1.age, tp1.isSwim);
                    break;
                case 2:
                    ThemePark2 tp2 = new ThemePark2();
                    tp2.getVisitorDetails();
                    tp2.set();
                    tp2.display();
                    tp2.playDiving(tp2.age, tp2.isSwim);
                    tp2.playWatersports(tp2.age, tp2.isSwim);
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
```

**Ques 4 :** Create an abstract class named Bank that has a member method named getCustomerDetails() to fetch details of customer such as account number, account open year, name, age, average yearly balance. There is also an abstract method named checkPreviligeCustomer(int a, int y) which takes average yearly balance and account open year as inputs. Create two child classes Bank1 and Bank2. Use the base class method to get the customer details. Bank 1 categorizes a customer as previlige customer if the average yearly balance >= 100000 and if the customer account is more than 5 years. Bank 1 categorizes a customer as previlige customer if the average yearly balance >= 200000 and if the customer account is more than 4 years. Use the abstract method in the child classes to validate the previlige customer logic. Create a menu listing Bank1 and Bank2. If the user enters 1, theme Bank1 is selected and processed further. If the user enters 2, theme Bank2 is selected and processed. Display the account number, name and Previlige Customer eligibility.

**Code :**

```java
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
```

**Ques 5 :** Implement a solution to question 4 using interface. Create an interface named Bank and have two methods getCustomerDetails() and checkPreviligeCustomer(int a, int y). Create two classes Bank1 and Bank 2 that implements the Bank interface.

**Code :**

```java
import java.util.*;

class Base {
    String name;
    int account_number, account_open_year, age, average_yearly_balance;
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public void display(){
        System.out.println("Name of Customer : " + name);
        System.out.println("Age of Customer : " + age);
        System.out.println("Account number of Customer : " + account_number);
        System.out.println("Account opening year of Customer : " + account_open_year);
        System.out.println("Average yearly balance of Customer : " + average_yearly_balance);
    }
}

interface Bank{
    void getCustomerDetails();
    void checkPreviligeCustomer(int a, int y);
}

class Bank1 extends Base implements Bank {
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

    public void checkPreviligeCustomer(int a, int y){
        if(a >= 100000 && (year - y) > 5)
            System.out.println("Privilage Customer");
        else
            System.out.println("Non Privilage Customer");
    }
}

class Bank2 extends Base implements Bank {
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

    public void checkPreviligeCustomer(int a, int y){
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
```
