package executeQuery;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Select2 {
	public Select2() throws SQLException{
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			//DriverManager.getConnection("jdbc:oracle:thin:Localized:1521:ORCL","hr","hr");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select FIRST_NAME||' '||LAST_NAME AS ENAME, EMPLOYEE_ID,SALARY,COMMISSION_PCT FROM EMPLOYEE "
					+ " WHERE SALARY >5000 AND SALARY<15000");
			while(rs.next()) {
				float salary=rs.getFloat(4);
				if(rs.wasNull())salary=0;
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+salary);
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
		new Select2();
	}

}
