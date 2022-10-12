# Exception Handling

**Ques 1 :** Read the Registration Number and Mobile Number of a student. If the Registration Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 digits, throw an IllegalArgumentException stating that "Registration number does not contain 9 characters" and "Mobile number does contain 10 digits". If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Registration Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’.

**Code 1 :**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Registation Number: ");
        String reg_no = sc.nextLine();
        System.out.print("Enter the Mobile Number: ");
        String mob_no = sc.nextLine();
        int err = 0;

        try{
            if (mob_no.length() != 10) {
                throw new IllegalArgumentException("Mobile number does contain 10 digits");
            }
        } catch (IllegalArgumentException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            if (reg_no.length() != 9) {
                throw new IllegalArgumentException("Registration number does not contain 9 characters");
            }
        } catch (IllegalArgumentException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            for (int i = 0; i < mob_no.length(); i++)
                if (!Character.isDigit(mob_no.charAt(i)))
                    throw new NumberFormatException("Mobile number contains non-digit characters");
        } catch (NumberFormatException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            for (int i = 0; i < reg_no.length(); i++)
                if (!Character.isDigit(reg_no.charAt(i)) && !Character.isAlphabetic(reg_no.charAt(i)))
                    throw new NoSuchElementException("Registration number contains non-digit and non-alphabetic characters");
        } catch (NoSuchElementException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        if(err == 0)
            System.out.println("Valid");
    }
}
```

**Ques 2 :** Write a java program to open a file named ReadContent.txt and read and print the contents of the file. While doing so handle all the possible exceptions (checked and unchecked) that may arise and handle them properly. Ensure that the file is closed in the finally block after all the file manipulations are carried out.

**Code 2 :**

```java
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        String file_name = sc.nextLine();
        Scanner file_sc = null;
        try {
            File file = new File(file_name);
            file_sc = new Scanner(file);
            while (file_sc.hasNextLine()) {
                String data = file_sc.nextLine();
                System.out.println(data);
            }
            file_sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            if (file_sc != null) {
                file_sc.close();
            }
        }
    }
}
```

**Ques 3 :** Write a java program that will throw the following user defined messages when the respective unchecked exception occurs :

- "Manipulation of null value is not correct" when a null pointer exception is encountered.
- "Dividing by zero is not permitted" when a number is divided by zero.
- "Input string contains non-numeric data" when a number format exception is encountered given that an input is a string with no numeric values.

**Code 3 :**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try{
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.println("a/b = " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not permitted");
        } catch (InputMismatchException e) {
            System.out.println("Input string contains non-numeric data");
        } catch (NullPointerException e) {
            System.out.println("Manipulation of null value is not correct");
        }
    }
}
```

**Ques 4 :** A swimming pool arena permits an individual to swim based on the criteria that the person is aged above 18 and knows swimming. Create two user defined exceptions namely SwimmingNotKnown and InvalidAge exceptions. Based on the input age and swimming status entered by the user, the program should check and display the appropriate exception message.

**Code 4 :**

```java
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
```
