class MyThread implements Runnable{
	
	private int tickets=5;

	public  void run()
	{
		synchronized(this)
	{
			while (tickets>0)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Ü‡Æ±Ê£ğN"+tickets+"ˆ");
				tickets--;
			}		
	}
		
	}
}



public class ThreadTest {
	public static void main(String args[])
	{
		Runnable r1=new MyThread();

		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);

		t1.start();
		t2.start();


	}
}
