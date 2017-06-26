package Lab_12;

public class Problem_1 implements Runnable{
	int a,b;
	Thread t1,t2;
	public Problem_1() {
		a=2;b=3;
		 t1=new Thread(this,"Thread-1");
		 t2=new Thread(this,"Thread-2");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		int sum=0,mul=1;
		if(Thread.currentThread()==t1)
		{
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+":"+a++);
			}
		}
		if(Thread.currentThread()==t2)
		{
			for (int i = 1; i < 5; i++) {
				mul=b*i;
				System.out.println(Thread.currentThread().getName()+":"+mul);
				
			}
		}
		
	}
	/*public void run() {
		
		
	};*/
	public static void main(String[] args) {
		
		
		Problem_1 p=new Problem_1();
	
	}

	
}
