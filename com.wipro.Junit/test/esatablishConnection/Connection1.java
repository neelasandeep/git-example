package esatablishConnection;
import java.sql.*;

public class Connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			System.out.println("Connection established successfully");
			con.close();
		}catch(ClassNotFoundException e) {
			System.out.println("Connection not established");
		}catch(SQLException s) {
			s.printStackTrace();
			
		}
		

	}

}
