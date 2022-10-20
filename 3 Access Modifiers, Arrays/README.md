# Access Modifiers, Arrays

**Ques 1 :** Write a simple java program to perform addition of two 3 x 3 matrices using arrays.

**Code :**

```java
import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        System.out.println("\nEnter elements of Matrix 1 - ");
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of Matrix 2 - ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nResult of matrix addition is - ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = b[i][j] + a[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

**Ques 2 :** Using a simple java program, demonstrate the working of matrix multiplication using arrays.

**Code :**

```java
import java.util.*;

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("\nEnter elements of Matrix 1 - ");
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of Matrix 2 - ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nResult of matrix addition is - ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

**Ques 3 :** Assume that VIT is registering new first year students into its Student Management System. Create a class named StudentDetails. Details such as Name, Registration Number, Department, Date of Birth, email id and mobile number are fetched. The registration number starts with 202201. As new students get instantiated, the registration number should get auto-incremented and mapped to the instance. There should be a method named display that prints all the details pertaining to each student instance. Create 5 student instances for this StudentDetails class and display the details of each instance.

**Code :**

```java
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

```

**Ques 4 :** Assume that your Java faculty has assigned an online quiz. Create a class named JavaQuiz which comprises of details like StudentName, RegNo, emailID and mobileNo. The Java faculty wants to know how many students have enrolled for this quiz. Have a data member named studentCount that is incremented as the students create their instances for the JavaQuiz class. Have display method to display the student details along with the student count printed.

**Code :**

```java
import java.util.*;

class JavaQuiz{
    String name;
    int regno;
    String dept;
    static int enrolled = 0;
    static int count = 0;
    JavaQuiz() {
        enrolled = 0;
        count++;
        enrolled = count + enrolled;
    }
    void display() {
        System.out.println("Name of the student : " + name);
        System.out.println("Register Number of the student : " + regno);
        System.out.println("Count of Registered Number : " + enrolled);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaQuiz j1 = new JavaQuiz();
        System.out.print("Enter name of the student : ");
        j1.name = sc.next();
        System.out.print("Enter name of the Register Number : ");
        j1.regno = sc.nextInt();
        j1.display();

        JavaQuiz j2 = new JavaQuiz();
        System.out.print("Enter name of the student : ");
        j2.name = sc.next();
        System.out.print("Enter name of the Register Number : ");
        j2.regno = sc.nextInt();
        j2.display();
        sc.close();
    }
}
```

**Ques 5 :** Create the below two classes and execute the TestThis program. Observe the output. Modify the below program suitably using "this" such that the instance details are printed.

**Code :**

```java
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class Main{
    public static void main(String args[]){
        Student s1 = new Student(111, "Bala", 5000f);
        Student s2 = new Student(112, "Sundaram", 6000f);
        s1.display();
        s2.display();
    }
}
```

**Ques 6 :** Assume that you have a class names First and you try to execute the same using another class TestFirst. What will be the output? If there any compilation errors, how will you correct the same so that the variable values are printed.

**Code :**

```java
class First{
    public int data = 40;
    public void msg(){
        System.out.println("Hello java");
    }
}

public class Main{
    public static void main(String args[]){
        First obj = new First();
        System.out.println(obj.data);
        obj.msg();
    }
}
```

**Ques 7 :** Assume that you have a class named Second inside a package p1. Using another class TestSecond which is in package p2, you try to instantiate the P1 class. What will be the output? How can the error observed if any be resolved.

**Code :**

```java
package p1;

public class Second {
    public void msg() {
        System.out.println("Hello");
    }
}
```

```java
package p2;
import p1.*;
public class TestSecond{
    public static void main(String args[]){
        Second obj = new Second();
        obj.msg();
    }
}
```

**Ques 8 :** Assume that class Three present in package p1 has a protected method msg(). How will you access this protected method msg() from another class present in package p2?

**Code :**

```java
package p1;
public class Three{
    protected void msg(){
        System.out.println("Hello");
    }
}
```

```java
package p2;
import p1.*;

public class TestThree extends Three{
    public static void main(String[] args) {
        TestThree acc = new TestThree();
        acc.msg();
    }
}
```
