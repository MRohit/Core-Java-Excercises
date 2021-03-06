class Account
{
	private int accId;
	private	String name;
	private float balance;

	public Account(int accId, String name, float balance) {
		this.accId = accId;
		this.name = name;
		this.balance=balance;
	}

	float getBalance() 
	{
		return balance;
	}

	public void deposit(float amt)
	{
		try
		{
			float curBalance;
			curBalance = balance;

			System.out.println("Balance = " + balance + "from " + Thread.currentThread() );
			Thread.currentThread().sleep(1000);
			
			curBalance=curBalance+amt;
			Thread.currentThread().sleep(1000);

			balance=curBalance;
			System.out.println("Written Balance = " + balance + "from " + Thread.currentThread() );
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	 public  void withdraw(float amt)
	{
		try
		{
			float curBalance;
			curBalance=balance;

			System.out.println("Balance = " + balance + "from " + Thread.currentThread() );
			Thread.currentThread().sleep(1000);
			
			curBalance=curBalance-amt;
			Thread.currentThread().sleep(1000);
	
			balance=curBalance;
			System.out.println("Written Balance = " + balance + "from " + Thread.currentThread() );
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}


class AccountUser extends Thread
{
	boolean operation;
	Account ac;
	float amt;

	public AccountUser(Account ac, boolean operation, float amt) {
		this.operation = operation;
		this.ac=ac;
		this.amt=amt;
	}

	public void run() {
//		synchronized(ac) {

		if(operation == true)
			ac.deposit(amt);
		else
			ac.withdraw(amt);
//		}
	}
}


public class SynchronizationTest
{
	public static void main(String[] args)
	{
		try	{
			
			final boolean deposit = true , withdraw = false;
			
			Account account1 = new Account(100,"Smith",5000);


			AccountUser gourab = new AccountUser(account1,deposit,1000);

			AccountUser abhijit = new AccountUser(account1,withdraw,500);

			
			gourab.start();
			abhijit.start();


			gourab.join();
			abhijit.join();


			System.out.println("Final Balance of account1 = " + account1.getBalance());

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}