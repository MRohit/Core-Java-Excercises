import java.io.IOException;

class PingPong extends Thread
{
	String word;
	int time;

	public PingPong(String w,int time) {
		word = w;
		this.time = time;
	}

	public void run() {
		try
		{
			while(true) {
				System.out.print(word + "   ");
				Thread.sleep(time);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception Caught : " + e);
		}
	}

	public static void main(String args[])
	{
		
		Thread first = new PingPong("Ping",1000);
		Thread second = new PingPong("Pong",500);
		
		first.start();
		second.start();
	
		System.out.println("Ending main().........");
		return;
			
	}


}