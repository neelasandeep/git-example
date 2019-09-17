package tm10_project2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestItems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Items ie=new Items();
		int i;
		int choice;
		try {
        do {
        	System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
        	System.out.println("Enter Your Choice");
        	
        		
        	
        	choice=sc.nextInt();
        	while(choice>5) {
        		System.out.println("invalid choice please enter valids input");
        		choice=sc.nextInt();
        	}
        	
        	switch(choice) {
        	case 1: System.out.println("Enter The item to be inserted");
        	        i= ie.insertItems(sc.next());
        	        if(i==1) {
        	        	System.out.println("Inserted succesfully");
        	        }else {
        	        	System.out.println("Not Inserted");
        	        }
        	        break;
        	case 2: System.out.println("Enter The item to be Searched");
        	          i= ie.searchItem(sc.next());
 	                 if(i==1) {
 	                	System.out.println("Item Found in the List");
 	                 }else {
 	                 	System.out.println("Item Not Found in the List");
 	                  }
 	                     break;
        	case 3:   System.out.println("Enter The item to Delete");
	                      i= ie.deleteItem(sc.next());
                           if(i==1) {
         	          System.out.println("Item deleted from the List");
                        }else {
          	           System.out.println("Item doesn't exists in the List");
                        }
                         break;
        	case 4:    ie.displayItems();
        	           break;
        	case 5 :   System.out.println("Existing System");
        	             break;
    		}
        	
        }while(choice!=5);
        }catch(InputMismatchException e) {
    		System.out.println("InputMismatchException occured");
    	}
		sc.close();
	}

}
