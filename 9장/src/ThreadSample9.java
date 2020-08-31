
public class ThreadSample9 implements Runnable {
	
	private String mark;
	
	public ThreadSample9(String mark) {
		
		this.mark = mark;
	}
	
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new ThreadSample9("-"), "Prio1");
		Thread th5 = new Thread(new ThreadSample9("/"), "Prio5");
		Thread th10 = new Thread(new ThreadSample9("*"), "Prio10");
		
		th1.setPriority(Thread.MIN_PRIORITY);
		th5.setPriority(Thread.NORM_PRIORITY);
		th10.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th5.start();
		th10.start();
	}
	
	public void run() {
		
		for(int i=0; i<200; i++) {
			System.out.println(mark);
			
			for(int j=0;j<10000;j++);
		}
		System.out.print(Thread.currentThread().getName()+" done");
	}

}
