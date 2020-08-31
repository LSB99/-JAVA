package p1;

public class ModifierExample {

	protected int uniqueClassId;
	
	public ModifierExample() {
		uniqueClassId = System.identityHashCode(this);
	}
	
	protected void printClassId() {
		System.out.println("Hashcode of ModifierExample object : "+this.uniqueClassId);
	}
}
