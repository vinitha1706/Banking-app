package OverrideTask;

public class Current extends Account {
	
	Current(double balance,double amount) {
		super(balance);
		this.amount=amount;
	}
	void Withdraw(double amount) {
		if(amount<=(balance-25000.0)) {
			super.Withdraw(amount);
			}
		else {
			System.out.println("You cant able to withdraw amount,alteast minimum balance should be 25000!");
		}
			}
	 
	void Deposite(double amount) {
	    super.Deposite(amount);}
	
}
