
public class ThreadSample7 {
	
	public static void main(String[] args) {
		
		String threadname = Thread.currentThread().getName();
		System.out.println("Thread name : "+ threadname);
		
		String threadgroupname = Thread.currentThread().getThreadGroup().getName();
		System.out.println("Thread Group name : "+ threadgroupname);
	}
}
