package assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment5 {

	public static void main(String[] args)throws SQLException {
		
		Connection con=null;
		String sql="select *from students where ROLL_NO=?";
		 try {
			 int rollno=Integer.parseInt(args[0]);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 pstmt.setInt(1, rollno);
		
		 ResultSet rs =pstmt.executeQuery();
		 
		while(rs.next()) {
			if(rs.equals(null)) {
				 System.out.println("no information available");
				 break;
			}
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			
		}
		 
		 }catch(Exception se) {
			 
			 
			 try {
				 Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				  sql="select *from students";
			 PreparedStatement pstmt=con.prepareStatement(sql);
			 
			
			 ResultSet rs =pstmt.executeQuery();
			
			 
			while(rs.next()) {
				if(rs.equals(null)) {
					 System.out.println("no information available");
					 break;
				}
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
				
			}
			 
			 }catch(Exception se1) {
				se1.printStackTrace(); 
				 
			 }
		 }
		 
		 
		 

	}

}
