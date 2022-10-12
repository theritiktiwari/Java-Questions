# IO Streams

**Ques 1 :** Using suitable I/O streams, write a Java program to read the content of a file named Input.txt and print the contents of the same. Count the number of words in the file and number of sentences in the file

**Code 1 :**

```java
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        int wordCount = 0;
        int sentenceCount = 0;
        while (line != null) {
            String[] words = line.split(" ");
            wordCount += words.length;
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            line = br.readLine();
        }
        System.out.println("Number of words : " + wordCount);
        System.out.println("Number of sentences : " + sentenceCount);
    }
}
```

**Ques 2 :** Using java I/O streams, write a java program that reads the contents of a file named "Input.txt" and writes the following into another file "Output.txt"

- No. of Bytes of data in the input file.
- No. of sentences in the file.
- No. of words that start with "J"

**Code 2 :**

```java
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("No. of Bytes of data in the input file: " + br.read() +  "\n");
        String line = br.readLine();
        int count = 0, sentenceCount = 0;
        while(line != null){
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            String[] words = line.split(" ");
            for(String word : words){
                if(word.startsWith("J")){
                    count++;
                }
            }
            line = br.readLine();
        }
        bw.write("No. of sentences in the input file: " + sentenceCount + "\n");
        bw.write("No. of words starting with J in the input file: " + count);
        br.close();
        bw.close();
    }
}
```

**Ques 3 :** Write a program to demonstrate the knowledge of students in File handling. Eg., Define a class Donor to store the below mentioned details of a blood donor. Name, age, Address, Contact number, blood group, date of last donation Create n objects of this class for all the regular donors at VIT. Write these objects onto a file. Read these objects from the file and display only those donor's details whose blood group is A +ve and had not donated for the recent six months.

**Code 3 :**

```java
import java.io.*;
import java.util.*;
import java.text.*;
class Donor{
    String name, age, blood_group, address, contact, lastDonationDate;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the donor : ");
        name = sc.nextLine();
        System.out.print("Enter the blood group of the donor : ");
        blood_group = sc.nextLine();
        System.out.print("Enter the age of the donor : ");
        age = sc.nextLine();
        System.out.print("Enter the address of the donor : ");
        address = sc.nextLine();
        System.out.print("Enter the contact number of the donor : ");
        contact = sc.nextLine();
        System.out.print("Enter the last donation date of the donor (DD-MM-YYYY) : ");
        lastDonationDate = sc.nextLine();
    }
}
public class Main{
    static boolean diff(String lastDate){
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        boolean check = false;
        try{
            Date date1 = obj.parse(lastDate);
            long time_difference = currentDate.getTime() - date1.getTime();
            long six_months = 6 * 30 * 24 * 60 * 60 * 1000;
            if(time_difference >= six_months){
                check = true;
            }
        } catch (ParseException excep) {
            excep.printStackTrace();
        }
        return check;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of donors : ");
        int n = sc.nextInt();
        Donor[] d = new Donor[n];
        for(int i = 0; i < n; i++){
            d[i] = new Donor();
            d[i].input();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("donors.txt"));
        for(int i = 0; i < n; i++){
            bw.write(d[i].name + " " + d[i].blood_group + " " + d[i].age + " " + d[i].address + " " + d[i].contact + " " + d[i].lastDonationDate);
            bw.newLine();
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("donors.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] s = line.split(" ");
            if(s[1].equals("A+") && diff(s[5])){
                System.out.println("Name : " + s[0]);
                System.out.println("Blood Group : " + s[1]);
                System.out.println("Age : " + s[2]);
                System.out.println("Address : " + s[3]);
                System.out.println("Contact : " + s[4]);
                System.out.println("Last Donation Date : " + s[5]);
            }
        }
        br.close();

    }
}
```
