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