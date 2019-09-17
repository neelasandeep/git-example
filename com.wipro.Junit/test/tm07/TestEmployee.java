package tm07;
import java.util.ArrayList;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		int i;
		AddEmployee ae=new AddEmployee();
		DisplayEmployee de=new DisplayEmployee();
		ArrayList<Employee1> finalArray=new ArrayList<>();
		finalArray=null;
		Scanner sc=new Scanner(System.in);
		do {
			
		System.out.println("-------Main Menu-------");
		System.out.println("1.Add Employee\n2. Display All\n3.exit");
		System.out.println("Enter your option between(1...3)"); 	
		i=sc.nextInt();
		
		switch(i) {
		case 1:       
			      
			         finalArray=ae.addemployee();
			         if(finalArray==null)
			        	 System.out.println("Objects not written to the 'empdata.txt' file because of invalid input");
		             break;
		case 2:     
			      int value=de.display( finalArray);
			      if(value==0) System.out.println("No Objects Exists in empdata.txt file");
			    
			         break;
		case 3: System.out.println("Existing the System"); 	
		          break;
		default:System.out.println("Invalid input"); 	
		}
		
		}while(i!=3);
		
       sc.close();
	}

}
