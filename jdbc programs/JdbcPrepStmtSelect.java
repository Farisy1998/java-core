import java.sql.*;

public class JdbcPrepStmtSelect {
    public static void main(String args[]) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
            PreparedStatement stmt = conn.prepareStatement("select first_name, last_name from employees where salary > ?");
            stmt.setDouble(1, 50000);
            ResultSet res = stmt.executeQuery();
            display(res);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void display(ResultSet res) {
        try {
            while (res.next()) {
                System.out.println(res.getString("first_name")+" "+res.getString("last_name"));
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}