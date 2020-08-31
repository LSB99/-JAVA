package Six6ÁÖÂ÷;

import java.util.*;

public class EnumerationExample1 {
	
	private final int LENGTH = 10;
	private Vector<Integer> vector = new Vector<Integer>();
	private Hashtable<Integer, String> table = new Hashtable<Integer, String>();
	
	public static void main(String[] args) {
		
		EnumerationExample1 example = new EnumerationExample1();
		example.init();
		example.execute();
	}
	
	public void init() {
		
		for(int i=0; i<this.LENGTH; i++) {
			vector.addElement(i);
			table.put(i, "Str"+i);
		}
	}
	
	public void execute() {
		
		
		Enumeration<Integer> eInt = vector.elements();
		
		while(eInt.hasMoreElements()) {
			
			System.out.println("["+eInt.nextElement()+"]");
		}
		
		System.out.println();
		
		Enumeration<String> eStr = table.elements();
		
		while(eStr.hasMoreElements()) {
			System.out.println("["+eStr.nextElement()+"]");
		}
		
		System.out.println();
	}

}
