
public class ChildThread implements Runnable{

	
	public static void main(String[] args) {
		
		Thread th = new Thread(new ChildThread());
		th.start();
		
		System.out.println("Main Thread is done");
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println("is running...");
			
			try {
				
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
