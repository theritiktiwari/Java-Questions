import java.util.*;
public class Main{
    public static void main(String[] args){
        Map<String, String> phone = new HashMap<>();
        phone.put("Name1", "9876543210");
        phone.put("Name2", "9988776655");
        phone.put("Name3", "1122334455");
        System.out.println("Current Phonebook - \n" + phone);
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        char c;
        String num;
        do{
            System.out.println("L. Look up a phone number\n" + "A. Add or change a phone number\n" + "R. Remove an entry from your phone directory\n" + "D. List the entire phone directory\n" + "E. Exit from the program\n");
            System.out.print("Please enter your choice ? : ");
            c = sc.next().charAt(0);
            switch(c){
                case 'L':
                    System.out.print("Enter the phone number you want to search : ");
                    num = sc.next();
                    System.out.println("Is the phone number present in phonebook ? " + phone.containsValue(num));
                    break;
                
                case 'A':
                    System.out.println("1. Add a phone number. \n" + "2. Change a phone number.");
                    System.out.print("Choose the correct option ? : ");
                    int ch = sc.nextInt();
                    if(ch == 1){
                        System.out.print("Enter the phone number : ");
                        String phone_num = sc.next();
                        System.out.print("Enter the phone number holder's name : ");
                        String phone_name = sc.next();
                        phone.put(phone_name, phone_num);
                        System.out.println("Phonebook currently - \n" + phone);
                    } else if(ch == 2){
                        System.out.print("Enter the phone number holder's name : ");
                        String phone_name = sc.next();
                        System.out.print("Enter the new phone number : ");
                        String phone_num = sc.next();
                        phone.replace(phone_name, phone_num);
                        System.out.println("Phonebook currently - \n" + phone);
                    }
                    break;   
                            
                case 'R':
                    System.out.print("Enter the person's name whose entry you want to remove from the phone directory : ");
                    String name = sc.next();
                    phone.remove(name);
                    System.out.println("Phonebook after removing the entry - \n" + phone);
                    break;
                
                case 'D':
                    System.out.println("Phonebook currently - \n" + phone);
                    break;
                
                case 'E':
                    System.exit(0);
                    break;
            }
            System.out.print("Please enter your next choice : ");
            c = sc.next().charAt(0);
        } while(c != 'E');
    }
}