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