import java.util.*;
class workshop extends Thread{
    int price;
    int tot_price;
    static int count = 0;
    workshop(){
        price = 100;
        count++;
    }
    public void run(){
        System.out.println("Number of registrations in workshop : " + count);
        System.out.println("Registration cost in workshop : " + (price * count));
    }
}

class poster extends Thread{
    int price;
    int tot_price;
    static int count = 0;
    poster(){
        price = 200;
        count++;
    }
    public void run(){
    System.out.println("Number of registrations in poster presentation : " + count);
    System.out.println("Registration cost in poster presentation : " + (price * count));
    }
}

class hackathon extends Thread{
    int price;
    int tot_price;
    static int count = 0;
    hackathon(){
        price = 300;
        count++;
    }
    public void run(){
        System.out.println("Number of registrations in hackathon : " + count);
        System.out.println("Registration cost in hackathon : " + (price * count));
    }
}

public class Main{
    public static void main(String[]args){
        String regno;
        String type;
        int c = 0;
        workshop w1 = new workshop();
        poster p1 = new poster();
        hackathon h1 = new hackathon();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Please enter your registration number : ");
            regno = in.next();
            System.out.print("Please enter the event type (Workshop/Poster/Hackathon) ? ");
            type = in.next();
            if(type.equals("Workshop")){
                w1.run();
                c++;
            } else if(type.equals("Poster")){
                p1.run();
            } else if(type.equals("Hackathon")){
                h1.run();
            }
        }
    }
}