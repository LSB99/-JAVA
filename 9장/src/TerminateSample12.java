
public class TerminateSample12 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread(new TerminateSample12());
		th.start();
		
		Thread.sleep(50);
		
		th.interrupt();
	}
	
	public void run() {
		
		while(!Thread.interrupted()) {
			
			System.out.println("is running...");
			
			for(int i=0;i<10000000;i++);
		}
		
		System.out.println("terminated");
	}
	
}
