import java.util.*;

class SwimmingNotKnown extends Exception {
    public SwimmingNotKnown(String message) {
        super(message);
    }
}

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

public class Main {
    static int err = 0;
    static void validAge(int age) throws InvalidAge {
        if (age <= 18) {
            err = 1;
            throw new InvalidAge("Can't match the age criteria");
        }
    }
    static void canSwim(boolean canSwim) throws SwimmingNotKnown {
        if (!canSwim) {
            err = 1;
            throw new SwimmingNotKnown("Can't match the swimming criteria");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Can swim?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        boolean canSwim = (choice == 1) ? true : false;
        try {
            validAge(age);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
        try {
            canSwim(canSwim);
        } catch (SwimmingNotKnown e) {
            System.out.println(e.getMessage());
        } 
        if (err == 0) {
            System.out.println("You are eligible to swim");
        }
    }
}