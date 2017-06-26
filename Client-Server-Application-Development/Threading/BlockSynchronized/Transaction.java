package BlockSynchronized;



public class Transaction extends Thread{
	Account account;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	Transaction(Account account,String name){
		super(name);
		this.account=account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<2){
			try{
				if(Thread.currentThread().getName().equals("One")){
					withdraw(1000);
					Thread.sleep(3000);
				}
				if(Thread.currentThread().getName().equals("Two")){
					deposit(2000);
					Thread.sleep(1000);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			i++;
		}
	}
	private  void withdraw(int amount) {
		// TODO Auto-generated method stub
		synchronized (this){
			try{
				account.lock.lock();
				double balamt=account.getBalance();
				System.out.println("Withdrawl:"+amount);
				double bal=balamt-amount;
				account.setBalance(bal);
				balamt=account.getBalance();
				System.out.println("\t"+balamt);
				System.out.println();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				account.lock.unlock();
			}
		}
		
	}
	private void deposit(int amount) {
		// TODO Auto-generated method stub
		synchronized (this) {
			try{
				account.lock.lock();
				double balamt=account.getBalance();
				System.out.println("Deposit Amount:"+amount);
				double bal=balamt+amount;
				account.setBalance(bal);
				balamt=account.getBalance();
				System.out.println("\t"+balamt);
				System.out.println();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				account.lock.unlock();
			}
		}
	}
	public static void main(String[] args) {
		int initial=5000;
		System.out.println("Original Balance:"+initial);
		Account account=new Account(initial);
		Thread t1=new Transaction(account, "One");
		Thread t2=new Transaction(account, "Two");
		t1.start();
		t2.start();
	}
}

