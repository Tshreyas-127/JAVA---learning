package orga.ycpait.bankapp.entity;

public class Account {

	private int balance;
	
	public Account(int balance) {
		this.balance=balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	synchronized public void withdraw(int amount) {	
		
		System.out.println(this.balance+" Check balance by "+ Thread.currentThread().getName());
		this.balance = this.balance - amount;
		System.out.println(this.balance+" Check balance by "+ Thread.currentThread().getName());
		System.out.println();
	}
	
	
	synchronized public void deposit(int amount) {

		System.out.println(this.balance+" Check balance by "+ Thread.currentThread().getName());
		this.balance = this.balance + amount;
		System.out.println(this.balance+" Check balance by "+ Thread.currentThread().getName());
	}
	
}
