
public class ThreadSample8 implements Runnable{
	
	public static void main (String[] args) {
		
		Thread th = new Thread(new ThreadSample8());
		th.start();
		th.start();
	}
	
	public void run() {
		
		try {
			
			Thread.sleep(1000);
			System.out.println("Working now");
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
