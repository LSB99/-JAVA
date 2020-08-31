
public class ThreadGroupSample2 implements Runnable{
	
	public static void main(String[] args) {
		
		new Thread(new ThreadGroupSample2()).start();
		
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		
		threadGroup.interrupt();
	}

	public void run() {
		
		while(true) {
			
			System.out.println("is running...");
			
			try {
				
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				
				e.printStackTrace();
				break;
			}
		}
	}
}
