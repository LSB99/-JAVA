
public class ConcurrentSample2 implements Runnable{

	private int res = 0;
	
	public static void main(String[] args) {
		
		ConcurrentSample2 concurrent = new ConcurrentSample2();
		Thread th1 = new Thread(concurrent);
		Thread th2 = new Thread(concurrent);
		
		th1.start();
		th2.start();
		
		try {
			
			th1.join();
			th2.join();
		}
		
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(concurrent.res);
	}
	
	public void run() {
		
		sum();
	}
	
	private void sum() {
		
		synchronized(this) {
			for(int i=0;i<10000;i++) {
				res++;
			}
			
		}	
	}
}
