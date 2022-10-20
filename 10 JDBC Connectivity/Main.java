import java.util.*;
import java.sql.*;

class newMap {
    Map<String, String> map = new HashMap<String, String>();

    void input(String name, String desig) {
        map.put(name, desig);
    }

    void display() {
        System.out.println(map);
    }
}

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "root";
    static final String PASS = "ritik123";
    static Connection conn = null;

    public static void main(String[] args) {
        newMap m = new newMap();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many entries ? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name : ");
            String name = sc.next();
            System.out.print("Enter Designation : ");
            String desig = sc.next();
            m.input(name, desig);
        }

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            if (conn != null) {
                Statement stmt = conn.createStatement();
                String sql = "CREATE TABLE IF NOT EXISTS EMPLOYEE (name VARCHAR(255), designation VARCHAR(255))";
                stmt.executeUpdate(sql);
                System.out.println("Table Created");
                System.out.println("- - - - - - - - - - - - - - -");

                for (Map.Entry<String, String> entry : m.map.entrySet()) {
                    sql = "INSERT INTO EMPLOYEE (name, designation) VALUES ('" + entry.getKey() + "', '"
                            + entry.getValue() + "')";
                    stmt.executeUpdate(sql);
                }
                System.out.println("Data Inserted");
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "SELECT * FROM EMPLOYEE";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(
                            "Name : " + rs.getString("name") + ", Designation : " + rs.getString("designation"));
                }
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "SELECT * FROM EMPLOYEE where designation = 'Manager'";
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(
                            "Name : " + rs.getString("name") + ", Designation : " + rs.getString("designation"));
                }
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "SELECT DISTINCT designation FROM EMPLOYEE";
                rs = stmt.executeQuery(sql);
                System.out.println("Designations - ");
                int i = 1;
                while (rs.next()) {
                    System.out.println(i + " : " + rs.getString("designation"));
                    i++;
                }
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "UPDATE EMPLOYEE SET designation = 'MGR' WHERE designation = 'Manager'";
                stmt.executeUpdate(sql);
                System.out.println("Designation Updated");
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "SELECT * FROM EMPLOYEE";
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(
                            "Name : " + rs.getString("name") + ", Designation : " + rs.getString("designation"));
                }
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "DELETE FROM EMPLOYEE WHERE designation = 'Clerk'";
                int count = stmt.executeUpdate(sql);
                if (count > 1)
                    System.out.println(count + " Rows Deleted");
                else
                    System.out.println(count + " Row Deleted");
                System.out.println("- - - - - - - - - - - - - - -");

                sql = "DROP TABLE IF EXISTS EMPLOYEE";
                stmt.executeUpdate(sql);
                System.out.println("Table Dropped");

                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong");
        }

        sc.close();
    }
}
