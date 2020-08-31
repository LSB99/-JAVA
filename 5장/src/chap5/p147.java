package chap5;

public class p147 {
	
	public p147(){
		
	}

	public static void main(String[] args)
	{
		String firstName = "Benjamin";
		String lastName = "Kim";
		
		p147 example1 = new p147();
		String fullName = example1.merge(firstName , lastName);
		int nameLength = example1.getLength(fullName);
		
		System.out.println("Full name = "+fullName+",  Length ="+nameLength);	
	}
	
	public int getLength(String str)
	{
		if(str==null||"".equals(str))
			return 0;
		
		return str.length();
	}
	
	public String merge(String str1, String str2)
	{
		return str1+" "+str2;
	}
}
