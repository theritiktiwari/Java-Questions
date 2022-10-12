import java.util.*;
class StudentDetails {
    String name;
    static int regno;
    String dept;
    static int count = 0;
    
    StudentDetails(){
        regno = 202201;
        regno = regno + count;
        count++;
    }
    void display(){
        System.out.println("Name of the student: " + name);
        System.out.println("Register Number of the student: " + regno);
        System.out.println("Department of the student: " + dept);
    }

    public static void main(String[] args){
        StudentDetails s1 = new StudentDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student : ");
        s1.name = sc.next();
        System.out.print("Enter department of the student : ");
        s1.dept = sc.next();
        s1.display();
        
        StudentDetails s2 = new StudentDetails();
        System.out.print("Enter the name of the student : ");
        s2.name = sc.next();
        System.out.print("Enter department of the student : ");
        s2.dept = sc.next();
        s2.display();

        StudentDetails s3 = new StudentDetails();
        System.out.print("Enter the name of the student : ");
        s3.name = sc.next();
        System.out.print("Enter department of the student : ");
        s3.dept = sc.next();
        s3.display();

        StudentDetails s4 = new StudentDetails();
        System.out.print("Enter the name of the student : ");
        s4.name = sc.next();
        System.out.print("Enter department of the student : ");
        s4.dept = sc.next();
        s4.display();
        
        StudentDetails s5 = new StudentDetails();
        System.out.print("Enter the name of the student : ");
        s5.name = sc.next();
        System.out.print("Enter department of the student : ");
        s5.dept = sc.next();
        s5.display();

        sc.close();
    }
}
