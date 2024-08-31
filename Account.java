package OverrideTask;

public class Account {
    double balance,amount;
	Account(double balance){
		this.balance=balance;
	}
	void checkbalance() {
		System.out.println("Balance: "+balance);
	}
	void Withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Balance after withdraw: "+balance);
		
	}
	void Deposite(double amount) {
		balance=balance+amount;
		System.out.println("Balance after deposite: "+balance);
	}

}
