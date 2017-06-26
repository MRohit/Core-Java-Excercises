package InnerClass;

import InnerClass.Account.Locker;

public class AccountLocal {
	int act_id;
	String name;
	float bal;
	AccountLocal(){
		act_id=1;
		name="ABC";
		bal=255.5f;
	}
	public void Info(){
		final int i=0;
		class Locker{
			int lock_id;
			Locker(){
				lock_id=5445;
			}	
			void Show(){
				System.out.println("In Inner Class\n"+i+"\t"+name+"\t"+bal+"\t"+lock_id);
			}
		}
		Locker l=new Locker();
		l.Show();
		System.out.println("Account information is:"+act_id+"\t"+name+"\t"+bal+"\t"+l.lock_id);		
	}
	public static void main(String[] args) {
		AccountLocal a=new AccountLocal();
		a.Info();
	
	}
}
