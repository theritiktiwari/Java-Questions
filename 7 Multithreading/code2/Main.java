import java.util.*;
class MulTable{
    synchronized void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread{
    MulTable t;
    Thread1(MulTable t){
        this.t=t;
    }
    public void run(){
        t.printTable(2);
    }
}

class Thread2 extends Thread{
    MulTable t;
    Thread2(MulTable t){
        this.t=t;
    }
    public void run(){
        t.printTable(3);
    }
}

class Thread3 extends Thread{
    MulTable t;
    Thread3(MulTable t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

public class Main{
    public static void main(String args[]){
        MulTable Obj = new MulTable();
        Thread1 T1 = new Thread1(Obj);
        Thread2 T2 = new Thread2(Obj);
        Thread3 T3 = new Thread3(Obj);
        T1.start();
        T2.start();
        T3.start();
    }
}