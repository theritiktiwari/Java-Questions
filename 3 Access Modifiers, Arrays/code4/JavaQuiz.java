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
