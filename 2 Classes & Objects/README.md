# Classes & Objects

**Ques 1 :** Create a class named ConferenceRegistration that is used for getting the participant details. The following details are to be gathered: Paper ID, Author Name, Registration Amount = 7000, Registration Date. A discount of 50% is applicable for participants who are members of XYZ Computer Society. The discount should be applicable while registering itself (Use parameterised constructor / constructor overloading). Create three participant objects of whom one is a member of XYZ Computer Society. Display the registration details of all three participants.

**Code 1 :**

```java
import java.util.*;

public class ConferenceRegistration{
    int paperId, registrationAmount;
    String name, registrationDate;
    char society;

    ConferenceRegistration(){
        this.registrationAmount = 7000;
        this.society = 'N';
    }

    ConferenceRegistration(char society){
        this.society = society;
        this.registrationAmount = 3500;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the paper ID : ");
        this.paperId = sc.nextInt();
        System.out.print("Enter the name : ");
        this.name = sc.next();
        System.out.print("Enter the registration date : ");
        this.registrationDate = sc.next();
    }

    void display(){
        System.out.println("Paper ID : " + paperId);
        System.out.println("Name : " + name);
        System.out.println("Registration Date : " + registrationDate);
        System.out.println("Registration Amount : " + registrationAmount);
    }

    public static void main(String args[]){
        ConferenceRegistration obj1 = new ConferenceRegistration();
        System.out.println("\nFor Participant 1 -");
        obj1.input();
        ConferenceRegistration obj2 = new ConferenceRegistration('Y');
        System.out.println("\nFor Participant 2 -");
        obj2.input();
        ConferenceRegistration obj3 = new ConferenceRegistration();
        System.out.println("\nFor Participant 3 -");
        obj3.input();

        System.out.println("\nParticipant 1 Details");
        obj1.display();
        System.out.println("\nParticipant 2 Details");
        obj2.display();
        System.out.println("\nParticipant 3 Details");
        obj3.display();
    }
}
```

**Ques 2 :** Create a class named Employee where the details pertaining to employees such as Employee ID, Name, Department, Salary and Designation are added. Create a member method named incentive which will add 10% of salary as bonus to all employees. For some employees who have been exceptional in their work an additional bonus of Rs. 10000 is given. Overload the incentive method to perform this. Create three employee objects of whom one is an exceptional employee. Display the revised salary details along with the employee id and name for all the three employees.

**Code 2 :**

```java
import java.util.*;
public class Employee {
    int id;
    float salary;
    String name, department, designation;

    void incentive(){
        salary += salary * 0.1;
    }

    void incentive(int bonus){
        salary += (salary * 0.1) + bonus;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID : ");
        this.id = sc.nextInt();
        System.out.print("Enter the name : ");
        this.name = sc.next();
        System.out.print("Enter the department : ");
        this.department = sc.next();
        System.out.print("Enter the designation : ");
        this.designation = sc.next();
        System.out.print("Enter the salary : ");
        this.salary = sc.nextFloat();
    }

    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Revised Salary : " + salary);
    }

    public static void main(String args[]){
        Employee obj1 = new Employee();
        System.out.println("\nFor Employee 1 -");
        obj1.input();
        Employee obj2 = new Employee();
        System.out.println("\nFor Employee 2 -");
        obj2.input();
        Employee obj3 = new Employee();
        System.out.println("\nFor Employee 3 -");
        obj3.input();

        obj1.incentive();
        obj2.incentive(5000);
        obj3.incentive();

        System.out.println("\nEmployee 1 Details");
        obj1.display();
        System.out.println("\nEmployee 2 Details");
        obj2.display();
        System.out.println("\nEmployee 3 Details");
        obj3.display();
    }
}
```

**Ques 3 :** Assume that a gallon of paint covers about 300 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following: Calculates the wall area for a room, passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed, displays the number of gallons needed, computes the price based on a paint price of $30 per gallon. Assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon. Return the price to the main() method The main() method displays the final price. Save the application as PaintCostFinder.java

**Code 3 :**

```java
import java.util.*;
public class PaintCostFinder{
    int gallon = 300;
    int rate = 30;
    int cost(int area){
        int num = (int)Math.ceil(area / gallon);
        System.out.println("The number of gallons of paint needed is " + num);
        return num * rate;
    }

    int area(int length, int breadth, int height){
        int area = length * breadth * height;
        return cost(area);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PaintCostFinder pcf = new PaintCostFinder();
        System.out.print("Enter the length of the room : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the room : ");
        int breadth = sc.nextInt();
        System.out.print("Enter the height of the room : ");
        int height = sc.nextInt();
        int price = pcf.area(length, breadth, height);
        System.out.println("The total cost of paint is $" + price);
    }
}
```

**Ques 4 :** On the 75th Year of India's Independence the Railway department decides to offer special discounts to Freedom Fighters on select trains between select cities. Create a class named RailwayReservation which captures the details such as passenger name, age, seatno, train no, freedom fighter (Y / N), source, destination and ticket fare. The source and destination details and the corresponding fare are populated as below:

| Source  | Destination | Ticket Fare |
| ------- | ----------- | ----------- |
| Chennai | Mumbai      | 500         |
| Chennai | Delhi       | 800         |
| Chennai | Kolkata     | 700         |
| Delhi   | Mumbai      | 800         |
| Delhi   | Kolkata     | 700         |
| Mumbai  | Kolkata     | 800         |

These details should be initialized as the passenger object is created. While creating the object the passenger will enter the source and destination and these details should be populated automatically and the ticket fare should be returned. If the passenger is a freedom fighter he will pass an additional parameter namely freedomFighter = Y while creating the object. The ticket fare should be waived by 50% for the freedom fighter based on his choice of source and destination. Construct a class with suitable constructors, methods, fields etc.

**Code 4 :**

```java
import java.util.*;
public class RailwayReservation {
    int age, seatNumber, trainNumber, ticketFare;
    String name, source, destination;
    char freedomFighter;

    void addFare(){
        if(source.equals("Chennai")){
            if(destination.equals("Mumbai"))
                ticketFare = 500;
            else if(destination.equals("Delhi"))
                ticketFare = 800;
            else if(destination.equals("Kolkata"))
                ticketFare = 700;
        } else if(source.equals("Delhi")){
            if(destination.equals("Mumbai"))
                ticketFare = 800;
            else if(destination.equals("Kolkata"))
                ticketFare = 700;
        } else if(source.equals("Mumbai")){
            if(destination.equals("Kolkata"))
                ticketFare = 800;
        }
    }

    void waiver(){
        if(freedomFighter == 'Y' || freedomFighter == 'y')
            ticketFare -= (ticketFare * 0.5);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.print("Enter your seat number : ");
        seatNumber = sc.nextInt();
        System.out.print("Enter your train number : ");
        trainNumber = sc.nextInt();
        System.out.print("Enter your source : ");
        source = sc.next();
        System.out.print("Enter your destination : ");
        destination = sc.next();
        System.out.print("Enter your freedom fighter (Y/N) : ");
        freedomFighter = sc.next().charAt(0);
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Train Number : " + trainNumber);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Ticket Fare : " + ticketFare);
    }

    public static void main(String args[]){
        RailwayReservation rr = new RailwayReservation();
        rr.input();
        rr.addFare();
        rr.waiver();
        rr.display();
    }
}
```
