package tm05.project2;

public class SBAccount extends Account {
double interestRate;
double amount;

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public double calculateInterest() {
	return amount*getInterestRate()/100;
}
}







