package InnerClass;

public class Account {
	int act_id;
	String name;
	float bal;
	Account(){
		act_id=1;
		name="ABC";
		bal=255.5f;
	}
	class Locker{
		int lock_id;
		Locker(){
			lock_id=5445;
		}
		public void Info(){
			System.out.println("Account information is:"+act_id+"\t"+name+"\t"+bal+"\t"+lock_id);
		}
	}
	public static void main(String[] args) {
		Account a=new Account();
		Locker l=a.new Locker();
		l.Info();
	}
}
