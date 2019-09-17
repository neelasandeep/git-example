package jdbc_project.com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc_project.com.wipro.sales.bean.Stock;
import jdbc_project.com.wipro.sales.util.DButil;

public class StockDao {
	
public int insertStock(Stock sales) {
	
	String sql="insert into TBL_STOCK values(?,?,?,?,?)";
	try {
		Connection con=DButil.getConnection();
	PreparedStatement pstmt=con.prepareStatement(sql);
	pstmt.setString(1, sales.getProductId());
	pstmt.setString(2, sales.getProductname());
	pstmt.setInt(3, sales.getQuantityOnHand());
	pstmt.setDouble(4, sales.getProductUnitPrice());
	pstmt.setInt(5, sales.getReorderlevel());
	pstmt.executeUpdate();
	return 1;
	}catch(Exception e) {
		
		e.printStackTrace();
		return 0;
	}
}

public String generateproductID(String productName) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL";
	
	int SEQ_PRODUCT_ID = 0;
	String out = productName.toString().substring(0, 2);
	
	try {
		conn = DButil.getConnection();
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		SEQ_PRODUCT_ID = rs.getInt(1);
		
		out += SEQ_PRODUCT_ID;
		return out;
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}		
	

}
public int updateStock(String productID, int soldQty) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = "UPDATE TBL_STOCK SET Quantity_On_Hand = Quantity_On_Hand - ?"
			+ "WHERE Product_ID = ?";
	
	try {
		conn = DButil.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, soldQty);
		pstmt.setString(2, productID);
		
		if (pstmt.executeUpdate() == 1) return 1;
		else return 0;
	} catch (SQLException e) {
		e.printStackTrace();
		return 0;
	}
}
public Stock getStock(String productID) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql="select * from TBL_STOCK where Product_ID=?";
	try {
		conn = DButil.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, productID);
		
	     ResultSet rs= pstmt.executeQuery() ;
	     while(rs.next()) {
	      Stock stk=new Stock();
	      stk.setProductId(rs.getString(1));
	      stk.setProductname(rs.getString(2));
	      stk.setQuantityOnHand(rs.getInt(3));
	      stk.setProductUnitPrice(rs.getDouble(4));
	      stk.setReorderlevel(rs.getInt(5));
	      return stk;
	     }
	    
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}
	return null;
}
public int deleteStock(String productID) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = "DELETE TBL_STOCK WHERE Product_ID = ?";
	
	try {
		conn = DButil.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, productID);
		
		if (pstmt.executeUpdate() == 1) return 1;
		else return 0;
	} catch (SQLException e) {
		e.printStackTrace();
		return 0;
	}
}
}
