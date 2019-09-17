package jdbc_project.com.wipro.sales.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import jdbc_project.com.wipro.sales.bean.Sales;
import jdbc_project.com.wipro.sales.bean.SalesReport;
import jdbc_project.com.wipro.sales.bean.Stock;
import jdbc_project.com.wipro.sales.dao.SalesDao;
import jdbc_project.com.wipro.sales.dao.StockDao;

public class Administrator {
	StockDao stkdao=new StockDao();
	SalesDao saldao=new SalesDao();
 public String insertStock(Stock stkobj) {
	 if(stkobj==null) {
		 return "Do Not Valid For insertion";
	 }
	 else if(stkobj.getProductname().length()<2) {
		 return "Do Not Valid For insertion"; 
	 }
	 else {
		 String productid=null;
		 
		productid= stkdao.generateproductID(stkobj.getProductname());
		stkobj.setProductId(productid);
		if(stkdao.insertStock(stkobj)==1)
		return "inserted";
	 }
	 
	 return "Not Inserted";
 }
 public String deleteStock(String productid) {
	 if(stkdao.deleteStock(productid)==1) {
		 return "deleted";
	 }
	 return "record cannot be deleted";
 }
 public String insertSales(Sales sale) throws SQLException {
	 
	 String salesId=null;
	 if(sale==null) {
		 return "object not valid for insertion";
	 }else if(stkdao.getStock(sale.getProductId())==null) {
		 return "Unknown Product for Sales";
	 }else if(sale.getQuantitySold()>stkdao.getStock(sale.getProductId()).getQuantityOnHand()) {
		 return "Not enough Stock on Hand For Sale";
	 }else if(new Date().before(sale.getSalesDate())) {
		 return "invalid date";
	 }else {
		 salesId=saldao.generateSalesID(sale.getSalesDate());
		 sale.setSalesId(salesId);
		
			if(saldao.insertSales(sale)==1) {
				if(stkdao.updateStock(sale.getProductId(), sale.getQuantitySold())==1) {
					return "Completed";
				} else {return "error IN";}
			 }else {
				 return "error";
			 }
		
		 
	 }
	 
 }
  public ArrayList<SalesReport> getSalesReport()throws SQLException{
	 return saldao.getSalesReport();

 }
}
