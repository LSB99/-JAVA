class MyThread implements Runnable{

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

public class ThreadSample4 {

	
	public static void main(String[] args) {
		
		Thread sample4 = new Thread(new MyThread());
		//sample4.start();
		sample4.run();
		
		System.out.println("MainThread is terminated...");
	}
}

