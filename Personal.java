package OverrideTask;

import java.util.Scanner;

public class Personal extends Account {
	Scanner sc=new Scanner(System.in);
	Personal(double balance,double amount) {
			super(balance);
			this.amount=amount;}
	
	void Withdraw(double amount) {
		if(amount<=(balance-10000.0)) {
			super.Withdraw(amount);	
			}	
		else {
			System.out.println("You cant able to withdraw amount,alteast minimum balance should be 10000!");
			}
				}
		void Deposite(double amount) {
		super.Deposite(amount);	
		}
}
		