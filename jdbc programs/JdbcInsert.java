import java.sql.*;

class JdbcIn {
    public static void main(String args[]) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
            System.out.println("Connection established succcessfully");
            Statement stmt = conn.createStatement();
            System.out.println("Inserting...");
            int rowsAffected = stmt.executeUpdate(
                "insert into employees(last_name, first_name, email, department, salary) "+
                "values('Farisy K','Salmanul','salmanulfarisyk123@gmail.com','Trainee',12000)"
            );
            System.out.println("No: of rows affected is "+rowsAffected);
            ResultSet res = stmt.executeQuery("select * from employees order by last_name");

            while(res.next()) {
                System.out.println(res.getString("last_name")+" "+res.getString("first_name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}