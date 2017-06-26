package MethodSynchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
	double balance;
	Lock lock=new ReentrantLock();
	public Account(){
		balance=5000;
	}
	public Account(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
