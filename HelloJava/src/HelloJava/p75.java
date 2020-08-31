package HelloJava;

public class p75 {
	
	public static void main(String[] args)
	{
		int vluAfter = 0;
		long vluBefore = 0;
		char chrAfter = 'A';
		
		System.out.println("First reference : "+vluAfter++);
		System.out.println("First reference : "+--vluBefore);
		System.out.println("First reference : "+chrAfter++);
		
		
		System.out.println("Second reference : "+vluAfter);
		System.out.println("Second reference : "+vluBefore);
		System.out.println("Second reference : "+chrAfter);
		
	}

}
