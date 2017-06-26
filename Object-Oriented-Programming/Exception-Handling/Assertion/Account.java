package Assertion;



public class Account {
	String name;
	int bal;
	public Account() {
		name="ABC";
		bal=1000;
	}
	Account(String name,int bal){
		this.name=name;
		this.bal=bal;
	}
	public void Withdraw(int money) {
		assert (bal>1000 && ((bal-money)>1000)) : "Minimum balance Required is 1000";
			//throw new LessBalanceException();
	
			bal=bal-money;
			System.out.println("Transaction Successfully");
		
	}
	public static void main(String[] args) {
		Account a=new Account("XYS",2000);
		
			a.Withdraw(3000);
		
	}
}
