import java.sql.*;

public class JdbcSal {
    public static void main(String arg[]) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("select first_name, last_name from employees where salary>50000");

            while(res.next()) {
                System.out.println(res.getString("first_name")+" "+res.getString("last_name"));
            }
        }

        catch(Exception e) {
            System.out.println(e);
        }

    }
}
