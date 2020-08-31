package p2;

import p1.ModifierExample;

public class ModifierTester extends ModifierExample{

	public static void main(String[] args) {
		
		ModifierTester tester = new ModifierTester();
		tester.run();
	}
	
	public void run() {
		this.printClassId();
		
		int hashcode = this.uniqueClassId;
		System.out.println("Double check. Hashcode : "+hashcode);
		
	}
}
