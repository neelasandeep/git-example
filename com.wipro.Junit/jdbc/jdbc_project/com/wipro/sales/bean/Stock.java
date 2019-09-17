package jdbc_project.com.wipro.sales.bean;

public class Stock {
  String productId;
  String productname;
  int quantityOnHand;
  double productUnitPrice;
  int reorderlevel;
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getQuantityOnHand() {
	return quantityOnHand;
}
public void setQuantityOnHand(int quantityOnHand) {
	this.quantityOnHand = quantityOnHand;
}
public double getProductUnitPrice() {
	return productUnitPrice;
}
public void setProductUnitPrice(double productUnitPrice) {
	this.productUnitPrice = productUnitPrice;
}
public int getReorderlevel() {
	return reorderlevel;
}
public void setReorderlevel(int reorderlevel) {
	this.reorderlevel = reorderlevel;
}
  
}
