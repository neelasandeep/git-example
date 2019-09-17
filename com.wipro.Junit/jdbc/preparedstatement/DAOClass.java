package preparedstatement;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class DAOClass {
	private Connection con=null;
	public DAOClass() {
		 con=DBConnection.getConnection();
	}
	public boolean insert(int rollno, String name, String grade,String dob,int fee) {
		 String sql="insert into students values(?,?,?,?,?)";
		 try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 pstmt.setInt(1, rollno);
		 pstmt.setString(2, name);
		 pstmt.setString(3, grade);
		 pstmt.setString(4, dob);
		 pstmt.setInt(5, fee);
		 int n=pstmt.executeUpdate();
		 if(n==1) {
			return true;
		 }
		 }catch(SQLException se) {
			 return false;
			 
		 }
		return false;
		
	}
	 public boolean delete(int rollno) {
		 String sql="delete from students where ROLL_NO=?";
		 try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 pstmt.setInt(1, rollno);
		 int n=pstmt.executeUpdate();
		 if(n>0) {
			return true;
		 }
		 }catch(SQLException se) {
			 return false;
			 
		 }
		 
		return false;
	}
	 public boolean modify(int rollno,int fee) {
		 String sql="update students set FEE=? where ROLL_NO=?";
		 try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 pstmt.setInt(1, fee);
		 pstmt.setInt(2, rollno);
		 int n=pstmt.executeUpdate();
		 if(n>0) {
			return true;
		 }
		 }catch(SQLException se) {
			 return false;
			 
		 }
		 
		 
		 return false;
		
	}
	public void display(int rollno) {
		 String sql="select *from students where ROLL_NO=?";
		 try {
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
		 
		 }catch(SQLException se) {
			 se.printStackTrace(); 
			 
		 }
		 
		 
		 
		
	}
	 public void display() {
		 String sql="select *from stUdEnts";
		 try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 
		
		 ResultSet rs =pstmt.executeQuery();
		
		 
		while(rs.next()) {
			if(rs.equals(null)) {
				 System.out.println("no information available");
				 break;
			}
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			
		}
		 
		 }catch(SQLException se) {
			se.printStackTrace(); 
			 
		 }
		 
		 
		
	}

}
