package HelloJava;

public class p111 {
	
	public static void main(String[] args)
	{
		float price1 = 2.99F;
		
		System.out.println("price1 variable : "+price1);
		
		if(args!=null && args.length > 0)
		{
			float price2 = 3.99F;
			
			price1+=price2;
			
			System.out.println("prcie1 variable : "+price1);
			System.out.println("prcie2 variable : "+price2);
		}
	}

}
