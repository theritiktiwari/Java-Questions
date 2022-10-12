import java.util.*;
public class RailwayReservation {
    int age, seatNumber, trainNumber, ticketFare;
    String name, source, destination;
    char freedomFighter;

    void addFare(){
        if(source.equals("Chennai")){
            if(destination.equals("Mumbai"))
                ticketFare = 500;
            else if(destination.equals("Delhi"))
                ticketFare = 800;
            else if(destination.equals("Kolkata"))
                ticketFare = 700;
        } else if(source.equals("Delhi")){
            if(destination.equals("Mumbai"))
                ticketFare = 800;
            else if(destination.equals("Kolkata"))
                ticketFare = 700;
        } else if(source.equals("Mumbai")){
            if(destination.equals("Kolkata"))
                ticketFare = 800;
        }
    }

    void waiver(){
        if(freedomFighter == 'Y' || freedomFighter == 'y')
            ticketFare -= (ticketFare * 0.5);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.print("Enter your seat number : ");
        seatNumber = sc.nextInt();
        System.out.print("Enter your train number : ");
        trainNumber = sc.nextInt();
        System.out.print("Enter your source : ");
        source = sc.next();
        System.out.print("Enter your destination : ");
        destination = sc.next();
        System.out.print("Enter your freedom fighter (Y/N) : ");
        freedomFighter = sc.next().charAt(0);
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Train Number : " + trainNumber);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Ticket Fare : " + ticketFare);
    }

    public static void main(String args[]){
        RailwayReservation rr = new RailwayReservation();
        rr.input();
        rr.addFare();
        rr.waiver();
        rr.display();
    }
}