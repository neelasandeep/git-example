package executeQuery;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Select1 {
	public Select1() throws SQLException{
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			//DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEE");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}catch(ClassNotFoundException e) {
			System.out.println("No such driver exists");
		}finally {
			
			if(con!=null)con.close();
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
		}
	}

	public static void main(String[] args)throws SQLException {
		new Select1();
	}

}
