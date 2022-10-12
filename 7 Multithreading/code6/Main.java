import java.util.*;
class table1 extends Thread{
    public void run(){
        System.out.println(" catered to Table 1");
    }
}

class table2 extends Thread{
    public void run(){
        System.out.println(" catered to Table 2");
    }
}

class table3 extends Thread{
    public void run(){
        System.out.println(" catered to Table 3");
    }
}

class table4 extends Thread{
    public void run(){
        System.out.println(" catered to Table 4");
    }
}

public class Main{
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            if(i >= 1 && i <= 5){
                table1 t1 = new table1();
                System.out.print("Order " + i);
                t1.run();
            } else if(i >= 6 && i <= 10){
                table2 t2 = new table2();
                System.out.print("Order " + i);
                t2.run();
            } else if(i >= 11 && i <= 15) {
                table3 t3 = new table3();
                System.out.print("Order " + i);
                t3.run();
            } else {
                table4 t4 = new table4();
                System.out.print("Order " + i);
                t4.run();
            }
        }
    }
}