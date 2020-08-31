package HelloJava;

import java.util.*;

public class p62 {
	
	public static void main(String[] args)
	{
		String lastName = "Kim";
		String firstName = new String("Benjamin");
		
		Date endDate = new Date();
		Date nowDate = Calendar.getInstance().getTime();
		
		System.out.println("My full name is "+firstName+" "+lastName);
		System.out.println(endDate);
		System.out.println(nowDate);
	}

}
