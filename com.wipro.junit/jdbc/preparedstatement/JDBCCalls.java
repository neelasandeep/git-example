package preparedstatement;

public class JDBCCalls {
	
	public static void main(String[] args) {
		 DAOClass dao=new DAOClass();
		int option=Integer.parseInt(args[0]);
		
		switch(option) {
		case 1: int rollno=Integer.parseInt(args[1]);
						String name=args[2];
						String grade=args[3];
						String dob=args[4];
						int fee=Integer.parseInt(args[5]);
						if(dao.insert(rollno, name, grade, dob, fee)) {
							System.out.println("Inserted Succesfully");
						}else {
							System.out.println("Not Inserted");
						}
						break;
		case 2:			 rollno=Integer.parseInt(args[1]);
		  			    if(dao.delete(rollno)) {
		  			    	System.out.println("Deleted Succesfully");
		  			    }else {
							System.out.println("No such roll no exists");
						}
		  			    break;
		case 3:			rollno=Integer.parseInt(args[1]);
		 				fee=Integer.parseInt(args[2]);
		 				if(dao.modify(rollno, fee)) {
		 					System.out.println("Updated Succesfully");
		  			    }else {
							System.out.println("No such roll no exists");
						}
		 				break;
		case 4:			
						try {
						rollno=Integer.parseInt(args[1]);
						dao.display(rollno);
						}catch(Exception e) {
							dao.display();
						}
						break;
		default: System.out.println("Enter valid option");
		
		}

	}

}
