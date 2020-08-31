package five5ÁÖÂ÷;

public class ArrayExample1 {

	
	public static void main(String[] args) {
		
		String[] nameArray = new String[4];
		nameArray[0] = "Benjamin";
		nameArray[1] = "Hamzani";
		nameArray[2] = "lodoss";
		
		System.out.println("Array hashcode : "+System.identityHashCode(nameArray));
		
		System.out.println("Member hashcode : "+System.identityHashCode(nameArray[0]));
		
		System.out.println("\"Benjamin\" hashcode : "+System.identityHashCode("Benjamin"));
		
		System.out.println("Total length : "+nameArray.length);
		
		System.out.println("Object : "+nameArray[3]);
	}
}
