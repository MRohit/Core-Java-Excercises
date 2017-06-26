class PingPongR implements Runnable
{
	String word;

	public PingPongR(String w) {
		word=w;
	}

	public void run() {
		try
		{
			while(true) {
				System.out.print(word + "   ");
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Execption caught : " +e);
		}
	}
		
	public static void main(String[] args)
	{
		//try
		//{

		PingPongR r = new PingPongR("Ping");

		Thread first = new Thread(r);

		Thread second = new Thread(new PingPongR("Pong"));

		first.start();
		second.start();
		/*first.join();
		second.join();*/
		System.out.println("Ending main......");
		//}
		//catch(InterruptedException e){}
	}
}