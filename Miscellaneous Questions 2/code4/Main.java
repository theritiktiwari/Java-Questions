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
