
public class TerminateSample11 implements Runnable{

	public static void main(String[] args) throws InterruptedException{
		
		Thread th = new Thread(new TerminateSample11());
		th.start();
		
		Thread.sleep(50);
		
		th.interrupt();
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println("is running..."+Thread.interrupted());
			
			for(int i=0;i<10000000;i++);
		}
	}
}
