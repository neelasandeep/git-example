package tm05.project2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class IntrestCalculator {

	public static void main(String[] args) {
		int choice;
		 double amount;
		 int days;
		 int age;
		
		Scanner sc=new Scanner(System.in);
		 try {
		do {
		System.out.println("Main Menu");
		System.out.println("---------");
		System.out.println("1. Interest calculator-SB\n2. Interest Calculator-FD\n3. Interest Calculator-RD\n4 Exit\nEnter your option between(1..4):");
       
        choice=sc.nextInt();
        switch(choice) {
             case 1:    System.out.println("Enter the Average Amount in your Account");
                         String type;
                         boolean b=true;;
                          
                         SBAccount sb=new SBAccount();
                         amount=sc.nextDouble();
             	        while(amount<0) {
             	        	System.out.println(" Amount should positive please enter Valid amount");
             	        	amount=sc.nextDouble();
             	        	
                         }
             	       sb.setAmount(amount);
             	      do {
                         System.out.println(" Enter Which type of Acoount NRI/Normal");
                         type=sc.next();
                        
                         if(type.toUpperCase().equalsIgnoreCase("Normal") ) {
                        	 sb.setInterestRate(4.0);
                        	 System.out.println("Interest gained : Rs. "+sb.calculateInterest());
                        	 b=false;
                        }else if(type.toUpperCase().equalsIgnoreCase("Nri")){
                        	 sb.setInterestRate(6.0);
                        	 System.out.println("Interest gained : Rs. "+sb.calculateInterest());
                        	 b=false;
                        }else {
                        	System.out.println("Invalid option!!...Enter valid option");
                        	b=true;
                        }}while(b);
                         System.out.println(sb.calculateInterest());
                         break;
             case 2:     System.out.println("Enter the FD Amount");
                         
                          FDAccount fd=new FDAccount();
                         amount=sc.nextDouble();
            	        while(amount<0) {
            	        	System.out.println(" Amount should positive please enter Valid amount\nEnter the FD Amount");
            	        	amount=sc.nextDouble();
                        }
            	        fd.setAmount1(amount);
            	        System.out.println("Enter no of days"); 
            	         days=sc.nextInt();
            	         while(days<0) {
             	        	System.out.println(" Invalid days  please enter non negative values\nEnter no of days");
             	        	days=sc.nextInt();
             	        	
                         }
            	         fd.setNoOfDays(days);
                        
            	         System.out.println("Enter age"); 
            	         age=sc.nextInt();
            	         while(age<0) {
              	        	System.out.println(" Invalid age  please enter non negative values\n Enter age");
              	        	age=sc.nextInt();
              	        	
              	        	 
                          }
            	         fd.setAge1(age);
            	         System.out.println("Interest gained : Rs. "+fd.calculateInterest());
                        
                       break;
             case 3:            System.out.println("enter amount");
                              RDAccount rd=new RDAccount();
                                   amount=sc.nextDouble();
                          while(amount<0) {
            	               System.out.println("Amount should not be negative\nEnter Amount");
            	               amount=sc.nextDouble();
                              }
                             rd.setAmount(amount);
                          System.out.println("enter age");
                          age=sc.nextInt();
                          while(age<0) {
            	               System.out.println("Age should not be negative\nEnter Age");
            	               age=sc.nextInt();
                              }
                          rd.setAge(age);
                          System.out.println("Enter no of months");
                          days=sc.nextInt();
                          while(age<0) {
            	               System.out.println("no of months should not be negative\nEnter no of months");
            	               days=sc.nextInt();
                              }
                          rd.setNoofMonths(days);
                          System.out.println(rd.calculateInterest());
                          break;
             case 4:  System.out.println("Thanks for Using Interest Calculator");     
                      break;
                      
            	       
        } 
	             	}while(choice!=4); 
	          	}catch(InputMismatchException e) {
		      	System.out.println("java.lang.InputMismatchException Occured");
		        } 
		sc.close();
	}

}
