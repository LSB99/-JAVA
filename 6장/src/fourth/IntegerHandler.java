package fourth;

public class IntegerHandler {
	
	public static void main(String[] args) {
		IntegerHandler intHandler = new IntegerHandler();
		System.out.println(intHandler.getRangeInfo());
	}
	
	public String getRangeInfo() {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		String rt = "FROM : "+ min +", TO :"+max;
		return rt;
	}

}
