import java.sql.*;

public class JdbcDelete {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pswd = "student";

        try {
            Connection conn = DriverManager.getConnection(url, user, pswd);
            System.out.println("Connection established succcessfully");
            Statement stmt = conn.createStatement();
            System.out.println("Deleting...");
            int rowsAffected = stmt.executeUpdate("delete from employees where last_name = 'Farisy K'");
            ResultSet res = stmt.executeQuery("select * from employees order by last_name");
            System.out.println("No: of rows aftected is "+rowsAffected);
            while(res.next()) {
                System.out.println(res.getString("last_name")+" "+res.getString("first_name"));
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
