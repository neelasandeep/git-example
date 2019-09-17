package callable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CallTest {

	public static void main(String[] args)throws SQLException {
		Connection con=null;
		CallableStatement cstamt=null;
		int empno=Integer.parseInt(args[0]);
		try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		   PreparedStatement pstmt=con.prepareStatement("select * from EMP where EMPNO=?");
		   pstmt.setInt(1, empno);
		   ResultSet rs=pstmt.executeQuery();
		   cstamt=con.prepareCall("{call NET_SALARY(?,?)}");
		   cstamt.setInt(1, empno);
		   cstamt.registerOutParameter(2, Types.DOUBLE);
		   cstamt.execute();
		   double sal=cstamt.getDouble(2);
		   while(rs.next()) {
		   System.out.println("EMPNO = "+rs.getInt(1)+" EMPNAME = "+rs.getString(2)+" netsal = "+sal );
		   }
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
