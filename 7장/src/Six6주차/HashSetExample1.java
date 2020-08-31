package Six6주차;

import java.util.*;

public class HashSetExample1 {
	
	private int count = 0;
	private Random random = new Random();
	private HashSet<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		HashSetExample1 example = new HashSetExample1();
		example.init();
		example.execute();
	}
	
	public void init() {
		
		//10미만의 random 정수를 클래스 변수 HashSet set에 입력
		
		for(int i=0;i<10;i++) {
			set.add(random.nextInt(10));
		}
		
		this.printStatus(set);
	}
	
	
	public void execute() {
		
		HashSet<Integer> setObj = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			
			// 10미만의 랜덤한 정수를 set 객체에 추가
			
			setObj.add(random.nextInt(5));
		}
		
		this.printStatus(setObj);
		set.addAll(setObj);
		this.printStatus(set);
	}
	
	public void printStatus(HashSet<Integer> hashSet) {
		
		if(hashSet == null || hashSet.size() == 0) {
			
			System.out.println("Object is null or size is zero");
			return;
		}
		
		count++;
		
		//배열 내부 개수 확인
		
		Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
		System.out.print("count : " + count +", ");
		
		for(Integer item : array) {
			System.out.print("["+item+"] ");
		}
		
		System.out.println();
	}

}
