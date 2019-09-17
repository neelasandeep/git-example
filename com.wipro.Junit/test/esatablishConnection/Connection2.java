package esatablishConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection2 {
	
	public static void main(String[] args)throws SQLException {
		Connection con=null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			System.out.println("Connection established successfully");
			
		}
		catch(Exception e) {
			System.out.println("Connection not established");
		}finally {
			
         if (con != null) con.close();
		
}

	}

}
