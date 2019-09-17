package tm05.project2;

public class FDAccount extends Account{

	double interestRate1=3;
	double amount1;
	int age1;
	int noOfDays;
	
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount) {
		this.amount1 = amount;
	}
	public int getAge1() {
		return age1;
	}
	public void setAge1(int age) {
		this.age1 = age;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double calculateInterest() {
		
      if(amount1<10000000) {
    	  if(noOfDays>=7&& noOfDays<=14) {
    		  interestRate1=4.5;
    	  }else if(noOfDays>=15&& noOfDays<=29) {
    		  interestRate1=4.75;
    	  }else if(noOfDays>=30&& noOfDays<=45) {
    		  interestRate1=5.50;
    	  }else if(noOfDays>=46&& noOfDays<=60) {
    		  interestRate1=7.0;
    	  }else if(noOfDays>=61&& noOfDays<=184) {
    		  interestRate1=7.5;
    	  }else if(noOfDays>=185&& noOfDays<=365) {
    		  interestRate1=8.0;
    	  }
    	  if(age1>65) {
    		  
        	  interestRate1+=0.5;}
    	  
    	  return interestRate1*getAmount1()/100;
      }else {
    	  if(noOfDays>=7&& noOfDays<=14) {
    		  interestRate1=6.5;
    	  }else if(noOfDays>=15&& noOfDays<=29) {
    		  interestRate1=6.75;
    	  }else if(noOfDays>=30&& noOfDays<=45) {
    		  interestRate1=6.75;
    	  }else if(noOfDays>=46&& noOfDays<=60) {
    		  interestRate1=8.0;
    	  }else if(noOfDays>=61&& noOfDays<=184) {
    		  interestRate1=8.5;
    	  }else if(noOfDays>=185&& noOfDays<=365) {
    		  interestRate1=10.0;
    	  }
    	  return interestRate1*getAmount1()/100;
      }
      
     
		
	}
}
