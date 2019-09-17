package jdbc_project.com.wipro.sales.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import jdbc_project.com.wipro.sales.bean.Sales;
import jdbc_project.com.wipro.sales.bean.SalesReport;
import jdbc_project.com.wipro.sales.bean.Stock;
import jdbc_project.com.wipro.sales.service.Administrator;

public class SalesApplication {
     public static void main(String args[]) throws SQLException, ParseException{
    	 Administrator admin=new Administrator();
    	 Scanner sc=new Scanner(System.in);
    	 int option;
    	 do {
    		
    	 System.out.println("1.Insert Stock\n2.delete Stock\n3.Insert sales\n4.View SalesReport");
    	 System.out.println("Enter your Choice");
    	 option=sc.nextInt();
    	 switch(option) {
    	 case 1:
				Stock stock = new Stock();
				System.out.print("Enter product ID: ");
				stock.setProductId(sc.nextLine());
				sc.nextLine();
				System.out.print("Enter product name: ");
				stock.setProductname(sc.nextLine());
			
				System.out.print("Enter quantity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				
				System.out.print("Enter product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.print("Enter product reorder level: ");
				stock.setReorderlevel(sc.nextInt());
				
				String str=admin.insertStock(stock);
				System.out.print(str);
				break;
		
    	 case 2:
				System.out.print("Enter product id to be deleted: ");
				String removeId = sc.next();
				str = admin.deleteStock(removeId);
				if (str != null) System.out.println(removeId + " removed successfully");
				break;
			case 3:
				Sales sales = new Sales();
				System.out.print("Enter sales id: ");
				sales.setSalesId(sc.nextLine());
				sc.nextLine();
				System.out.print("Enter date (dd-mm-yyyy): ");
				String sDate = sc.next();  
			    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(sDate); 
				sales.setSalesDate(date);
				System.out.print("Enter product id: ");
				sales.setProductId(sc.next());
				System.out.print("Enter quantity sold: ");
				sales.setQuantitySold(sc.nextInt());
				
				System.out.print("Enter sales price per unit: ");
				sales.setSalesPricePerUnit(sc.nextInt());
				str=admin.insertSales(sales);
				System.out.println(str);
				break;
			case 4:
				ArrayList<SalesReport>al=new ArrayList<>();
				al=admin.getSalesReport();
				
				for(SalesReport se:al) {
					
					
					System.out.println(se.getSalesID()+" | "+se.getSalesDate()+" | "+se.getProductID()+" | "+se.getProductName()+" | "
							+se.getQuantitySold()+" |   "+se.getProductUnitPrice()+" | "+se.getSalesPricePerUnit()+" | "+se.getProfitAmount());
				}
				
				break;
			
			default:
				System.out.println("Exiting...");
				option = 0;
				
			}
		} while (option>= 1 && option <= 4);
		
		sc.close();
	
    	 
     }
}
