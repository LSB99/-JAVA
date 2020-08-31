package fourth;

public class LongHandler extends AbstractHandler{
	
	public static void main(String[] args){
		
		LongHandler longHandler = new LongHandler();
		System.out.println(longHandler.getRangeInfo());
	}
	
	public String getRangeInfo() {
		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		
		String rt = "From : "+min+", TO : "+max;
		return rt;
	}
}