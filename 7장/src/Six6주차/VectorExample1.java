package Six6주차;

import java.util.*;

public class VectorExample1 {

	//count 변수는 printStatus() 메소드의 호출 횟수를 카운트한다.
	
	private int count = 0;
	
	// 초기 capacity = 10 으로 증가 capacity 5로 선언
	
	private Vector<String> vector = new Vector<String>(10,5);
	
	public static void main(String[] args) {
		
		VectorExample1 example = new VectorExample1();
		example.execute();
	}
	
	public void execute() {
		
		//첫번째 printStatus 호출
		this.printStatus();
		
		
		for(int i=0;i<=9;i++) {
			vector.addElement(String.valueOf(i));
		}
		
		//두번째 printStatus 호출
		this.printStatus();
		
		
		
		for(int i=0;i<3;i++) {
			vector.addElement(String.valueOf(i));
		}
		//세번째 printStatus 호출		
		this.printStatus();
		
		
		vector.trimToSize();   // capacity()가  size() 값으로 수정된다.
		//네번째 printStatus 호출	
		this.printStatus();
		
		
		vector.setSize(20);
		//다섯번째 printStatus 호출	
		this.printStatus();
		
		System.out.println(vector.toString());
	}
	
	public void printStatus() {
		
		count++;
		System.out.println("["+count+"] capacity : "+vector.capacity()+", Element Size : "+vector.size());
	}
}
