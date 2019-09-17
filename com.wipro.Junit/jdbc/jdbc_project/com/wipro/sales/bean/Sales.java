package jdbc_project.com.wipro.sales.bean;

import java.util.Date;

public class Sales {
    
	String salesId;
	java.util.Date salesDate;
	String productId;
	int quantitySold;
	int salesPricePerUnit;
	public String getSalesId() {
		return salesId;
	}
	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}
	public java.util.Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(java.util.Date date) {
		this.salesDate =    date;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public int getSalesPricePerUnit() {
		return salesPricePerUnit;
	}
	public void setSalesPricePerUnit(int salesPricePerUnit) {
		this.salesPricePerUnit = salesPricePerUnit;
	}
}
