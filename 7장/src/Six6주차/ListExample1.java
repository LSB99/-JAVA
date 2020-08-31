package Six6주차;

import java.util.*;

public class ListExample1 {
	
	private final int MAX_INT = 9;
	private Random random = new Random();
	
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private Vector<Integer> vector = new Vector<Integer>();
	
	public static void main(String[] args) {
		
		ListExample1 example = new ListExample1();
		example.testArrayList();
		example.testVector();
	}
	
	public void testArrayList() {
		
		//arrayList 초기값 설정
		for(int i=0;i<MAX_INT;i++) {
			
			arrayList.add(random.nextInt(MAX_INT));
		}
		
		this.printMember(arrayList);
		
		arrayList.remove(2);
		this.printMember(arrayList);
		
		arrayList.add(8);
		this.printMember(arrayList);
		
		arrayList.clear();
		this.printMember(arrayList);
		
		System.out.println();
	}
	
	public void testVector() {
		
		//vector 초기값 설정
		for(int i=0;i<MAX_INT;i++) {
			vector.add(random.nextInt(MAX_INT));
		}
		
		this.printMember(vector);
		
		vector.remove(2);
		this.printMember(vector);
		
		vector.add(8);
		this.printMember(vector);
		
		vector.clear();
		this.printMember(vector);
		
	}
	

	public void printMember(List<Integer> list) {
		
		int totalSize = list.size();
		
		if(list instanceof ArrayList)
			System.out.print("ArrayList Member ("+totalSize+") : ");
		
		else if(list instanceof Vector)
			System.out.print("Vector Member ("+totalSize+") : ");
		
		else
			System.out.print("Unknown Member ("+totalSize+") : ");
		
		
		// 강화된  for 구문을 이용하여 멤버 객체 확인
		
		for(Integer item : list) {
			System.out.print("["+item+"]");
		}
		
		System.out.println();
	}
}
