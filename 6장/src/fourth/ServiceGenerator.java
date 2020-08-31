package fourth;

public class ServiceGenerator implements GeneratorInterface{
	
	public static void main(String[] args) {
		
		ServiceGenerator svcGenerator = new ServiceGenerator();
		String uniqueId = svcGenerator.getUniqueValue();
		System.out.println("Generate unique Id : "+uniqueId);
	}
	
	public String getUniqueValue() {
		String rt = ServiceGenerator.ID_HEADER;
		return rt;
	}

}
