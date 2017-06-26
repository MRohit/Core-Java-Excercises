class NewThread extends Thread {
    int value;
	
    public NewThread(String str){
        super(str); 
        value=0;
        start();    
    }

   public void run(){  
        try{
            while (value < 5){              
				System.out.println(getName() + ": " + (value++));
				Thread.sleep(250);  
            }
        } 
		catch (Exception e) {}
        
		System.out.println("Exit from thread: " + getName());
    }
}

public class DemoJoin{  

  public static void main(String[] args){
	    System.out.println("Main Started...........");
        NewThread da = new NewThread("Thread a");
        NewThread db = new NewThread("Thread b");

		 if (!da.isAlive())
                System.out.println("Thread A not alive.");
		 else
			  System.out.println("Thread A alive.");


         if (!db.isAlive())
                System.out.println("Thread B not alive.");
		 else
			  System.out.println("Thread B alive.");
	
		try
		{
			da.join();
			db.join();
			
		}
		catch (Exception e) {}

		 if (!da.isAlive())
                System.out.println("Thread A not alive.");

         if (!db.isAlive())
                System.out.println("Thread B not alive.");
   		
        System.out.println("Exit from Main Thread.");
    }
}

















/*try{
            
			
			if (!da.isAlive())
                System.out.println("Thread A not alive.");
			else
				System.out.println("Thread A  alive.");

            if (!db.isAlive())
                System.out.println("Thread B not alive.");
			else
				System.out.println("Thread B alive.");

			System.out.println("Wait for the child threads to finish.");

            da.join();
			db.join();

            if (!da.isAlive())
                System.out.println("Thread A not alive.");

            if (!db.isAlive())
                System.out.println("Thread B not alive.");

        } catch (Exception e) { }*/