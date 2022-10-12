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