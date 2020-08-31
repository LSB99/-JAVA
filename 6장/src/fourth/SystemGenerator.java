package fourth;

public class SystemGenerator implements GeneratorInterface{
	
	public static void main(String[] args) {
		
		SystemGenerator sysGenerator = new SystemGenerator();
		String uniqueId = sysGenerator.getUniqueValue();
		
		System.out.println("Generate unique id : "+uniqueId);
	}
	
	public String getUniqueValue() {
		String rt = SystemGenerator.ID_HEADER + System.nanoTime()+SystemGenerator.DELIMITER + System.identityHashCode(this);
		return rt;
	}
}
