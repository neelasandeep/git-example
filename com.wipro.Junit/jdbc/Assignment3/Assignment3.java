package Assignment3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Assignment3 {

	public static void main(String[] args) throws SQLException{
		int rollno=Integer.parseInt(args[0]);
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			pstmt=con.prepareStatement("insert into studentslog select * from students where ROLL_NO=?");
			pstmt.setInt(1, rollno);
			int n=pstmt.executeUpdate();
			if(n>0) {System.out.println(rollno+" inserted to studentlog successfully");
			}  else {
				n=0;
				System.out.println(rollno+" Not inserted to studentlog");
			}
			pstmt=con.prepareStatement("delete from students where ROLL_NO=?");
			pstmt.setInt(1, rollno);
			n=pstmt.executeUpdate();
			if(n>0) {System.out.println(rollno+" Deleted from students successfully");
			}  else {
				n=0;
				System.out.println(rollno+" Not Deleted from studentlog");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
            
	}

}
