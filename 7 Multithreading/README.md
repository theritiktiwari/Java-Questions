# Multithreading

**Ques 1 :** Assume that a course CSE1007 is offered in two slots D1 and D2 and each slot has only one class number. Write a simple java program using threads to track the student registration of each class and print the total number of students registered for D1 slot and D2 slot. Implement the solution by extending the thread class initially followed by implementation using runnable interface as well.

**Code :**

```java
import java.util.*;

class D1 extends Thread {
    static int D1_total = 0;
    public void run(){
        D1_total++;
    }
}

class D2 implements Runnable {
    static int D2_total = 0;
    public void run(){
        D2_total++;
    }
}

class student {
    D1 d1_slot = new D1();
    D2 d2_slot = new D2();
    String name, register_number, slot;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter register number : ");
        register_number = sc.nextLine();
        System.out.print("Enter slot : ");
        slot = sc.nextLine();
    }

    void check(){
        if(slot.equals("D1")){
            d1_slot.run();
        }
        else if(slot.equals("D2")){
            d2_slot.run();
        }
    }

    void display(){
        System.out.println("Total students registered for D1 : " + d1_slot.D1_total);
        System.out.println("Total students registered for D2 : " + d2_slot.D2_total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        student s = new student();
        for(int i = 0; i < n; i++) {
            s.input();
            s.check();
        }
        s.display();
    }
}
```

**Ques 2 :** Write a Java program to print three multiplication tables (2, 3 and 5) using threads. (i.e assign each thread for a table).

**Code :**

```java
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
```

**Ques 3 :** Consider the case of a producer consumer problem. Demonstrate the behaviour when there is no Inter Thread Communication (ITC) and subsequently show how ITC promotes effective communication between two threads.

**Code :**

- WITHOUT ITC

```java
import java.util.*;
class Produce_Consume{
    int i;
    synchronized void Produce(int i){
        this.i = i;
        System.out.println("Data Delivered : " + i);
    }
    synchronized int Consume(){
        System.out.println("Data Received : " + i);
        return i;
    }
}

class ProduceThread extends Thread{
    Produce_Consume obj;
    ProduceThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Produce(k);
    }
}

class ConsumeThread extends Thread{
    Produce_Consume obj;
    ConsumeThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Consume();
    }
}

class Main{
    public static void main(String[] args){
        Produce_Consume obj = new Produce_Consume();
        ProduceThread P = new ProduceThread(obj);
        P.start();
        ConsumeThread C = new ConsumeThread(obj);
        C.start();
    }
}
```

- WITH ITC

```java
class Produce_Consume{
    int i;
    boolean flag = false;
    synchronized void Produce(int i){
        if(flag)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        this.i = i;
        System.out.println("Data Delivered: " +i);
        flag = true;
        notify();
    }
    synchronized int Consume(){
        if(!flag)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        System.out.println("Data Received: " + i);
        flag = false;
        notify();
        return i;
    }
}

class ProduceThread extends Thread{
    Produce_Consume obj;
    ProduceThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Produce(k);
    }
}

class ConsumeThread extends Thread{
    Produce_Consume obj;
    ConsumeThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Consume();
    }
}

class Main{
    public static void main(String[] args){
        Produce_Consume obj = new Produce_Consume();
        ProduceThread P = new ProduceThread(obj);
        P.start();
        ConsumeThread C = new ConsumeThread(obj);
        C.start();
    }
}
```

**Ques 4 :** As part of a technical week celebration three events namely workshop, poster presentation and hackathon are organized. There are three registration desks put up for these events. The registration cost for workshop, poster presentation and hackathon is Rs.100, Rs.200 and Rs.300 respectively. Using threads track the registration count and registration cost of each event.

**Code :**

```java
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
```

**Ques 5 :** Assume that a courier delivery office has to deliver 10 parcels to two customers. Write a java program using threads to deliver the odd parcels to customer1 and even parcels to customer2.

**Code :**

```java
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
```

**Ques 6 :** Assume that a restaurant has received 20 orders. The first 5 orders have to be catered to table1, orders 6-10 for table 2, orders 11-15 for table 3 and orders 16-20 for table 4. Implement a solution for this using Java threads.

**Code :**

```java
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
```
