package five5ÁÖÂ÷;

import java.util.*;
public class ArrayExample3 {
	
	private Object[] array = new Object[6];
	
	public static void main(String[] args) {
		
		ArrayExample3 example = new ArrayExample3();
		
		example.init();
		example.printMember();
	}
	
	public void init() {
		
		array[0] = new String("My name is Benjamin Kim");
		array[1] = 32L;
		array[2] = 12;
		array[3] = 1102.5F;
		array[4] = 3.141592653589793238462643383279D;
		array[5] = new Date();
	}
	
	public void printMember() {
		
		if(array == null || array.length == 0) {
			
			System.out.println("Empty array");
			return;
		}
		
		for(int i=0;i<array.length;i++) {
			Object obj = array[i];
			
			if(obj instanceof String)
				System.out.println("String type : "+ (String)obj);
			
			else if(obj instanceof Long)
				System.out.println("Long type : "+(Long)obj);
			
			else if(obj instanceof Integer)
				System.out.println("Integer type : "+ (Integer)obj);
			
			else if(obj instanceof Double)
				System.out.println("Double type : "+ (Double)obj);
			
			else if(obj instanceof Float)
				System.out.println("Float type : "+ (Float)obj);
			
			else if(obj instanceof Date)
				System.out.println("Date type : "+ (Date)obj);
			
			else
				System.out.println("Undefined type");
		}
	}
}
