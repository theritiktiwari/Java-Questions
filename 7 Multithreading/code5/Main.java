import java.util.*;
class customer1 extends Thread{
    public void run(){
        System.out.println(" will be delivered to customer 1");
    }
}

class customer2 extends Thread{
    public void run(){
        System.out.println(" will be delivered to customer 2");
    }
}

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                customer1 c1 = new customer1();
                System.out.print("Parcel " + i);
                c1.run();
            } else{
                customer2 c2 = new customer2();
                System.out.print("Parcel " + i);
                c2.run();
            }
        }
    }
}