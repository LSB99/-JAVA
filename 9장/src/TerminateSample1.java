
public class TerminateSample1 implements Runnable {

	public static void main(String[] args) throws InterruptedException{
		
		Thread test = new Thread(new TerminateSample1(), "TEST");
		test.start();
		
		System.out.println("Press Ctrl+C to EXIT");
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println("Test is Running");
			
			try {
				
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
			
			System.out.println("End of Procedure");
		}
		
		System.out.println(Thread.currentThread().getName()+" is terminated");
	}
}
