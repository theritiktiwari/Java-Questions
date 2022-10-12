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