package User_Define_Exception;

class LessBalanceException extends Exception{
	int min_bal;
	public LessBalanceException() {
		min_bal=1000;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Minimum bal required is:"+min_bal;
	}
}
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
	public void Withdraw(int money) throws LessBalanceException{
		if(bal>1000 && ((bal-money)<1000)){
			throw new LessBalanceException();
		}else{
			bal=bal-money;
			System.out.println("Transaction Successfully");
		}
	}
	public static void main(String[] args) {
		Account a=new Account("XYS",5000);
		try{
			a.Withdraw(2000);
		}
		catch(LessBalanceException e){
			System.out.println(e);
		}
	}
}
