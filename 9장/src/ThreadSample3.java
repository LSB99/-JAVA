
public class ThreadSample3 implements Runnable {
	
	public static void main(String[] args) {
		
		Runnable r = new ThreadSample3();
		
		Thread sample3 = new Thread(r);
		
		sample3.start();
	}

	public void run() {
		
		System.out.println("Sample3 New flow, new thread is running");
	}
}
