import java.sql.*;

public class JdbcUpdate {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update employees set last_name = 'Wick' where email='john.doe@foo.com'");
            System.out.println("Updated successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
