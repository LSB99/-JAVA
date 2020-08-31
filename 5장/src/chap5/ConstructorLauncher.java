package chap5;

class ConstructorExample{
	
	public ConstructorExample() {
		
		System.out.println("First constructor is called");
	}
	
	public ConstructorExample(String str) {
		System.out.println("Second constructor is called with parameter : "+str);
	}
	
}

public class ConstructorLauncher {
	
	public static void main(String[] args)
	{
		ConstructorExample example1 = new ConstructorExample();
		ConstructorExample example2 = new ConstructorExample("Seconds");
		
		System.out.println(System.identityHashCode(example1));
		System.out.println(System.identityHashCode(example2));
	}

}
