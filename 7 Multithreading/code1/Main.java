import java.util.*;

class D1 extends Thread {
    static int D1_total = 0; 
    public void run(){ 
        D1_total++;
    }
}

class D2 implements Runnable {
    static int D2_total = 0;
    public void run(){ 
        D2_total++;
    }
}

class student {
    D1 d1_slot = new D1();
    D2 d2_slot = new D2();
    String name, register_number, slot;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter register number : ");
        register_number = sc.nextLine();
        System.out.print("Enter slot : ");
        slot = sc.nextLine();
    }

    void check(){
        if(slot.equals("D1")){
            d1_slot.run();
        }
        else if(slot.equals("D2")){
            d2_slot.run();
        }
    }

    void display(){
        System.out.println("Total students registered for D1 : " + d1_slot.D1_total);
        System.out.println("Total students registered for D2 : " + d2_slot.D2_total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt(); 
        student s = new student();
        for(int i = 0; i < n; i++) {
            s.input();
            s.check();
        }
        s.display();
    }
}