package tm05.project2;

public class RDAccount extends Account {
private int age;
private int noofMonths;
private double amount;
private double interestrate;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getNoofMonths() {
	return noofMonths;
}
public void setNoofMonths(int noofMonths) {
	this.noofMonths = noofMonths;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getInterestrate() {
	return interestrate;
}
public void setInterestrate(double interestrate) {
	this.interestrate = interestrate;
}
@Override
public double calculateInterest() {
	if(noofMonths>=6&& noofMonths<9) {
		  interestrate=7.5;
	  }else if(noofMonths>=9&& noofMonths<12) {
		  interestrate=7.75;
	  }else if(noofMonths>=12&& noofMonths<15) {
		  interestrate=8.0;
	  }else if(noofMonths>=15&& noofMonths<18) {
		  interestrate=8.25;
	  }else if(noofMonths>=18&& noofMonths<21) {
		  interestrate=8.5;
	  }else if(noofMonths>=21) {
		  interestrate=8.75;
	  }
	  if(age>65) {
		  
  	  interestrate+=0.5;}
	  
	  return interestrate*getAmount()/100;

	
}

}
