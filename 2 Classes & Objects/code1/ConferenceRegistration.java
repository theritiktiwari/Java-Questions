import java.util.*;

public class ConferenceRegistration{
    int paperId, registrationAmount;
    String name, registrationDate;
    char society;
    
    ConferenceRegistration(){
        this.registrationAmount = 7000;
        this.society = 'N';
    }
    
    ConferenceRegistration(char society){
        this.society = society;
        this.registrationAmount = 3500;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the paper ID : ");
        this.paperId = sc.nextInt();
        System.out.print("Enter the name : ");
        this.name = sc.next();
        System.out.print("Enter the registration date : ");
        this.registrationDate = sc.next();
    }

    void display(){
        System.out.println("Paper ID : " + paperId);
        System.out.println("Name : " + name);
        System.out.println("Registration Date : " + registrationDate);
        System.out.println("Registration Amount : " + registrationAmount);
    }

    public static void main(String args[]){
        ConferenceRegistration obj1 = new ConferenceRegistration();
        System.out.println("\nFor Participant 1 -");
        obj1.input();
        ConferenceRegistration obj2 = new ConferenceRegistration('Y');
        System.out.println("\nFor Participant 2 -");
        obj2.input();
        ConferenceRegistration obj3 = new ConferenceRegistration();
        System.out.println("\nFor Participant 3 -");
        obj3.input();
        
        System.out.println("\nParticipant 1 Details");
        obj1.display();
        System.out.println("\nParticipant 2 Details");
        obj2.display();
        System.out.println("\nParticipant 3 Details");
        obj3.display();
    }
}
