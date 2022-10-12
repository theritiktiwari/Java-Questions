# Basic Java Programs

**Ques 1 :** Write a Java Program to print hello world sting on the console.

**Code :**

```java
public class code1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

**Ques 2 :** Write a Java program to prompt the user to enter his / her first name and last name and then print a message 'Welcome' followed by the user's first and last name.

**Code :**

```java
import java.util.*;
public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.println("Welcome! " + firstName + " " + lastName);
    }
}
```

**Ques 3 :** Write a Java program to prompt the user to enter two binary numbers and display the sum of those two binary numbers on console.

**Code :**

```java
import java.util.*;
public class code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binary1, binary2;
        int i = 0, carry = 0;
        int[] sum = new int[10];
        System.out.print("Enter first binary number: ");
        binary1 = scanner.nextLong();
        System.out.print("Enter second binary number: ");
        binary2 = scanner.nextLong();
        while (binary1 != 0 || binary2 != 0){
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + carry) % 2);
            carry = (int)((binary1 % 10 + binary2 % 10 + carry) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (carry != 0)
            sum[i++] = carry;
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
```

**Ques 4 :** Write a Java program to prompt the user to enter the area of a circle and display the radius and perimeter of the circle.

**Code :**

```java
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the circle : ");
        double area = sc.nextDouble();
        double radius = Math.sqrt(area / Math.PI);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Radius of the circle is : " + radius);
        System.out.println("Perimeter of the circle is : " + perimeter);
    }
}
```

**Ques 5 :** Write a Java Program to read an integer and perform the following actions:
• If input number is odd, print You are odd
• If input number is even and in the inclusive range 2 of to 10 , print You are an even in the range 2-10
• If input number is even and in the inclusive range of 10 to 20, print You are an even in the range 10-20
• If is even and greater than 20, print You are an even who is greater than 20

**Code :**

```java
import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num >= 2 && num <= 10) {
                System.out.println("You are an even in the range 2-10");
            } else if (num >= 10 && num <= 20) {
                System.out.println("You are an even in the range 10-20");
            } else {
                System.out.println("You are an even who is greater than 20");
            }
        } else {
            System.out.println("You are odd");
        }
    }
}
```

**Ques 6 :** Write a java program to read an integer, a double, and a String from stdin (System.in), then print the values.

**Code :**

```java
import java.util.*;
public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        System.out.print("Enter a double : ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Int : " + num);
        System.out.println("Decimal : " + d);
        System.out.println("String : " + str);
    }
}
```

**Ques 7 :** Write a Java Program for reading an integer and printing first 10 multiples of the input integer.

**Code :**

```java
import java.util.*;
public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        System.out.print("10 multiples of " + num + " is : ");
        for(int i = 1; i <= 10; i++){
            System.out.print(num * i + " ");
        }
        System.out.print("\n");
    }
}
```
