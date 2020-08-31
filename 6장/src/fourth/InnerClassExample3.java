package fourth;
import java.util.*;
public class InnerClassExample3 {

	
	public static void main(String[] args) {
		
		InnerClassExample3 example = new InnerClassExample3();
		example.printStatus();
	}
	
	public void printStatus() {
		
		class DateFormat{  //지역 내부 클래스
			
			private Date date;
			
			public DateFormat(Date date) {
				this.date = date;
			}
			
			
			public String getDateFormat() {
				return date.toString();
			}
		}
		
		DateFormat format = new DateFormat(new Date());
		System.out.println("The Date : "+format.getDateFormat());
	}
}
