package HelloJava;

public class p92 {
	
	public static void main(String[] args)
	{
		String coffee1 = "Americano";
		String coffee2 = "Americano";
		
		System.out.println("coffee1 and coffee2 : "+((coffee1==coffee2)?"same":"not same"));
		
		String coffee3 = new String("Americano");
		String coffee4 = new String("Americano");
		
		System.out.println("coffee3 and coffee4 : "+((coffee3 == coffee4) ? "same" : "not same"));
		
		System.out.println(coffee3.equals(coffee4));
		
		System.out.println(coffee4.compareTo(coffee3));
		System.out.println(coffee4.endsWith("A"));
		System.out.println(coffee4.startsWith("A"));
		
		System.out.println(coffee4.indexOf("m"));
	}

}
