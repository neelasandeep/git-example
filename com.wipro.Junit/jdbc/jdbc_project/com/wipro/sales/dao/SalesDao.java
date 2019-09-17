package jdbc_project.com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import jdbc_project.com.wipro.sales.bean.Sales;
import jdbc_project.com.wipro.sales.bean.SalesReport;
import jdbc_project.com.wipro.sales.util.DButil;

public class SalesDao {
	     
	public int insertSales(Sales sale)throws SQLException {
		
		String sql="insert into TBL_SALES values(?,?,?,?,?)";
		try {
			Connection con=DButil.getConnection();
			java.sql.Date sqlDate = new java.sql.Date(sale.getSalesDate().getTime());
			
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, sale.getSalesId());
		pstmt.setDate(2, sqlDate);
		pstmt.setString(3, sale.getProductId());
		pstmt.setInt(4, sale.getQuantitySold());
		pstmt.setInt(5, sale.getSalesPricePerUnit());
		pstmt.executeUpdate();
		return 1;
		}catch(Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		
		
	}
	public String generateSalesID(Date salesDate) {		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL";
		
		int SEQ_SALES_ID = 0;
		String out = salesDate.toString().substring(salesDate.toString().length()-2, salesDate.toString().length());
		
		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			SEQ_SALES_ID = rs.getInt(1);
			
			out += SEQ_SALES_ID;
			return out;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public ArrayList<SalesReport>getSalesReport()throws SQLException{
		
		ArrayList<SalesReport> list=new ArrayList<>();
		String sql="Select * from V_SALES_REPORT";try {
			Connection con=DButil.getConnection();
		PreparedStatement pstmt =con.prepareStatement(sql);
		 ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			SalesReport salesReport = new SalesReport();
			salesReport.setSalesID(rs.getString(1));
			salesReport.setSalesDate(rs.getDate(2));
			salesReport.setProductID(rs.getString(3));
			salesReport.setProductName(rs.getString(4));
			salesReport.setQuantitySold(rs.getInt(5));
			salesReport.setProductUnitPrice(rs.getDouble(6));
			salesReport.setSalesPricePerUnit(rs.getDouble(7));
			salesReport.setProfitAmount(rs.getDouble(8));
			list.add(salesReport);
			
				
		}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
		
	}
	
}
