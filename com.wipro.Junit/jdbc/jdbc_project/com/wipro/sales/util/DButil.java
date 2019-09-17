package jdbc_project.com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
     public static Connection getConnection() {
    	 Connection con=null;
    	 try {
 			Class.forName("oracle.jdbc.driver.OracleDriver");
 			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
 			
 			
 		}catch(ClassNotFoundException e) {
 			System.out.println("Connection not established");
 		}catch(SQLException s) {
 			s.printStackTrace();
 			
 			
 		}
 		
   return con;
     }
}
