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