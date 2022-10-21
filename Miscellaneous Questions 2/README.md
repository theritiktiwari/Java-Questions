# Miscellaneous Questions 2

**Ques 1 :** Define a class Patient to store the below mentioned details of a patient - Name, age, Address, Contact number, blood group, date of last visit. Create n objects of this class for all the patients at BEST Hospital. Write these objects onto a file. Read these objects from the file and display only those patient details of those who have not visited BEST hospital for the past three months.

**Code :**

```java
import java.io.*;
import java.util.*;
import java.text.*;

class Patient {
    String name, age, blood_group, address, contact, lastVisitingDate;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the patient : ");
        name = sc.nextLine();
        System.out.print("Enter the blood group of the patient : ");
        blood_group = sc.nextLine();
        System.out.print("Enter the age of the patient : ");
        age = sc.nextLine();
        System.out.print("Enter the address of the patient : ");
        address = sc.nextLine();
        System.out.print("Enter the contact number of the patient : ");
        contact = sc.nextLine();
        System.out.print("Enter the last visiting date of the patient (DD-MM-YYYY) : ");
        lastVisitingDate = sc.nextLine();
    }
}

public class Main {
    static boolean diff(String lastDate) {
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        boolean check = false;
        try {
            Date date1 = obj.parse(lastDate);
            long time_difference = currentDate.getTime() - date1.getTime();
            long three_months = 7776000000L;
            if (time_difference >= three_months) {
                check = true;
            }
        } catch (ParseException excep) {
            excep.printStackTrace();
        }
        return check;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Patients : ");
        int n = sc.nextInt();
        Patient[] d = new Patient[n];
        for (int i = 0; i < n; i++) {
            d[i] = new Patient();
            d[i].input();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("patients.txt"));
        for (int i = 0; i < n; i++) {
            bw.write(d[i].name + " " + d[i].blood_group + " " + d[i].age + " " +
                    d[i].address + " " + d[i].contact + " "
                    + d[i].lastVisitingDate);
            bw.newLine();
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            if (diff(s[5])) {
                System.out.println("Name : " + s[0]);
                System.out.println("Blood Group : " + s[1]);
                System.out.println("Age : " + s[2]);
                System.out.println("Address : " + s[3]);
                System.out.println("Contact : " + s[4]);
                System.out.println("Last Visiting Date : " + s[5]);
            }
        }
        br.close();
        sc.close();
    }
}
```

**Ques 2 :** Demonstrate the working of a Tree Map with a suitable example and explain when Tree map will be useful.
<br/><br/>
The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the keyvalue pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads, concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.

**Code :**

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        System.out.println("Tree Map: " + treeMap);
    }
}
```

**Ques 3 :** Instead of using File Stream, use Buffered stream to read the contents of a file named "Input.txt" and write the details of the input file such as file size, number of sentences and word count into another output file "Output.txt".

**Code :**

```java
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("No. of Bytes of data in the input file: " + br.read() + "\n");
        String line = br.readLine();
        int sentenceCount = 0, wordCount = 0;
        while (line != null) {
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            String[] words = line.split(" ");
            wordCount = words.length;
            line = br.readLine();
        }
        bw.write("No. of sentences in the input file: " + sentenceCount + "\n");
        bw.write("No. of words in the input file: " + wordCount);
        System.out.println("Code executed successfully");
        br.close();
        bw.close();
    }
}
```

**Ques 4 :** Create a user defined exception RegNumNotFound. Create an arraylist comprising of 10 registration numbers. Ask the user to enter a registration number. Iterate through the arraylist and throw the RegNumNotFound exception if the entered registration number is not present in the Arraylist.

**Code :**

```java
import java.util.*;
class RegNumNotFound extends Exception {
    public RegNumNotFound(String s) {
        super(s);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("20BPS1087");
        list.add("20BPS1084");
        list.add("20BAI1009");
        list.add("20BPS1009");
        list.add("20BPS1031");
        list.add("20BPS1042");
        list.add("20BPS1061");
        list.add("20BPS1068");
        list.add("20BPS1072");
        list.add("20BPS1056");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the register number : ");
        String reg = sc.nextLine();
        try {
            if (list.contains(reg.toUpperCase()))
                System.out.println(reg + " is present in the list");
            else
                throw new RegNumNotFound(reg + " is not present in the list");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
```
