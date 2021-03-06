import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcTest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

			System.out.println("Database connection successfull!\n");

			// 2. Create a statement
			myStmt = myConn.createStatement();

			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employee;");

			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("lastname") + ", " + myRs.getString("firstname"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
