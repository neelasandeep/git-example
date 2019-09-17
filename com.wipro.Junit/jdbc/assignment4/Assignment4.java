package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Assignment4 {

	public static void main(String[] args) throws SQLException{
		
		int rollno=Integer.parseInt(args[0]);
		Connection con=null;
		PreparedStatement pstmt=null;
		
		int fee=Integer.parseInt(args[1]);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			pstmt=con.prepareStatement("update studentslog set FEE=? where ROLLNO=?");
			pstmt.setInt(1, fee);
			pstmt.setInt(2,rollno);
			int n=pstmt.executeUpdate();
			if(n>0) {System.out.println(rollno+" Fee amount updated Succesfully");
			}  else {
				n=0;
				System.out.println(rollno+" Not Updated");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
            
	}

}
