
class MyThread extends Thread{ 
  

  MyThread(String name){
    super(name);
  }

  public void run(){
      System.out.println("Child Thread started.....");
	   System.out.println(this);
	  System.out.println("Child Thread terminated.....");

    }


  public static void main(String args[])
  {
      System.out.println("Main started.....");

	  Thread t = Thread.currentThread();
	  System.out.println(t);
	  System.out.println("Name : " + t.getName());

	  t.setName("MainThread");
	  System.out.println("Name : " + t.getName());

	  
	  MyThread m1=new MyThread("Thread1");
	  m1.start();
	  try
	  {
		  Thread.sleep(500);
	  	
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  

	  System.out.println("Main Terminated.....");

   }
} 

