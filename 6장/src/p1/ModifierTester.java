package p1;

public class ModifierTester {

	public static void main(String[] args) {
		
		ModifierExample example = new ModifierExample();
		
		example.printClassId();
		
		int hashcode = example.uniqueClassId;
		System.out.println("Double check. Hashcode : "+hashcode);
	}
}
