package OverrideTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner sc=new Scanner(System.in);
				int accountno,password,pin,num,acc1=98,acc2=99,pswd1=1234,pswd2=1706;
	    double amount;
		System.out.println("Enter account number: ");
		accountno=sc.nextInt();
		System.out.println("enter password: ");
		password=sc.nextInt();
		if((acc1)==accountno & (pswd1)==password){
			Current amt=new Current(100000, 0);
			Personal amt1=new Personal(75000, 0);
            System.out.println("______WELCOME TO OUR BANK!______ ");
		do {
		System.out.println("Enter num 11.Current acc 21.Personal acc: ");
		num=sc.nextInt();
		switch(num){
		 case 11: {
			 do {
			System.out.println("Enter pin 1.Check balance 2.Withdraw 3.Deposite 4.Quit : ");
		     pin=sc.nextInt();
		    switch(pin) {
	    case 1:
		amt.checkbalance();
		break;
	    case 2:
		System.out.println("Enter amount you need to withdraw: ");
		amount=sc.nextDouble();
		amt.Withdraw(amount);
		break;
	    case 3:
		System.out.println("Enter amount you need to deposit: ");
		amount=sc.nextDouble();
		amt.Deposite(amount);
		break;
	    case 4:
	    	System.out.println("Exit.Thank you!");
	    	break;
	    default:
		System.out.println("Invalid pin ");
		break;}}while(pin!=4);}break;
		case 21:
			do {
		System.out.println("Enter pin 1.Check balance 2.Withdraw 3.Deposite 4.Quit : ");
		pin=sc.nextInt();
        switch(pin) {
		case 1:
			amt1.checkbalance();
			break;
		case 2:
			System.out.println("Enter amount you need to withdraw: ");
			amount=sc.nextDouble();
			amt1.Withdraw(amount);
			break;
		case 3:
			System.out.println("Enter amount you need to deposit: ");
			amount=sc.nextDouble();
			amt1.Deposite(amount);
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid pin");
			break;
        }
		}while(pin!=4);}
   
}while(num!=2);
		}
	else if((acc2)==accountno & (pswd2)==password) {
			Current amt=new Current(200000, 0);
			Personal amt1=new Personal(300000, 0);
			System.out.println("_____WELCOME TO OUR BANK!_____ ");
			do {
			System.out.println("Enter num 11.Current acc 21.Personal acc: ");
			num=sc.nextInt();
			switch(num){
			 case 11: {
				 do {
				System.out.println("Enter pin 1.Check balance 2.Withdraw 3.Deposite 4.Quit : ");
			     pin=sc.nextInt();
			    switch(pin) {
		    case 1:
			amt.checkbalance();
			break;
		    case 2:
			System.out.println("Enter amount you need to withdraw: ");
			amount=sc.nextDouble();
			amt.Withdraw(amount);
			break;
		    case 3:
			System.out.println("Enter amount you need to deposit: ");
			amount=sc.nextDouble();
			amt.Deposite(amount);
			break;
		    case 4:
		    	System.out.println("Exit.Thank you!");
		    	break;
		    default:
			System.out.println("Invalid pin ");
			break;}}while(pin!=4);}break;
			case 21:
				do {
			System.out.println("Enter pin 1.Check balance 2.Withdraw 3.Deposite 4.Quit : ");
			pin=sc.nextInt();
	        switch(pin) {
			case 1:
				amt1.checkbalance();
				break;
			case 2:
				System.out.println("Enter amount you need to withdraw: ");
				amount=sc.nextDouble();
				amt1.Withdraw(amount);
				break;
			case 3:
				System.out.println("Enter amount you need to deposit: ");
				amount=sc.nextDouble();
				amt1.Deposite(amount);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid pin");
				break;
	        }
			}while(pin!=4);}
	   
	}while(num!=2);
			}
	else {
		System.out.println("Invalid account no or password");
	}
		
}}
	

            
    	