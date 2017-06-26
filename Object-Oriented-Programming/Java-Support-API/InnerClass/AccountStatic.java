package InnerClass;

import InnerClass.Account.Locker;

public class AccountStatic {
	static int act_id=1;
	static String name="ABC";
	static float bal=555.5f;
	AccountStatic(){
		act_id=1;
		name="ABC";
		bal=255.5f;
	}
	static class Locker{
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
		Locker l=new Locker();
		l.Info();
	}
}
