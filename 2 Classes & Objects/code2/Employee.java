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