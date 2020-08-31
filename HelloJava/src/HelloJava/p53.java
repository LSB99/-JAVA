package HelloJava;

public class p53 {
	
	public static void main(String[] args)
	{
		System.out.println("byte range : "+ Byte.MIN_VALUE+" ~ "+ Byte.MAX_VALUE);
		System.out.println("short range : "+ Short.MIN_VALUE+" ~ "+ Short.MAX_VALUE);
		System.out.println("int range : "+ Integer.MIN_VALUE+" ~ "+ Integer.MAX_VALUE);
		System.out.println("long range : "+ Long.MIN_VALUE+" ~ "+ Long.MAX_VALUE);
		
		byte vlu =0;
		for(int i=0;i<300;i++) {
			System.out.println(vlu++);
		}
	}

}
