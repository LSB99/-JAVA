import java.util.ArrayList;

public class ConcurrentSample7 implements Runnable {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		ConcurrentSample7 concurrent = new ConcurrentSample7();
		
		Thread th1 = new Thread(concurrent);
		Thread th2 = new Thread(concurrent);
		Thread th3 = new Thread(concurrent);
		
		th1.start();
		th2.start();
		th3.start();
	}
	
	public void run() {
		
		long sTime = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++) {
			
			addList();
		}
		
		long eTime = System.currentTimeMillis();
		
		System.out.println(Thread.currentThread().getName()+" : "+(eTime-sTime)+"ms");
	}
	
	private void addList() {
		
		int val = (int)(Math.random()*10);
		
		synchronized(this) {
			
			if(!list.contains(val)) {
				list.add(val);
			}
		}
	}

}
