package Six6����;

import java.util.*;

public class VectorExample1 {

	//count ������ printStatus() �޼ҵ��� ȣ�� Ƚ���� ī��Ʈ�Ѵ�.
	
	private int count = 0;
	
	// �ʱ� capacity = 10 ���� ���� capacity 5�� ����
	
	private Vector<String> vector = new Vector<String>(10,5);
	
	public static void main(String[] args) {
		
		VectorExample1 example = new VectorExample1();
		example.execute();
	}
	
	public void execute() {
		
		//ù��° printStatus ȣ��
		this.printStatus();
		
		
		for(int i=0;i<=9;i++) {
			vector.addElement(String.valueOf(i));
		}
		
		//�ι�° printStatus ȣ��
		this.printStatus();
		
		
		
		for(int i=0;i<3;i++) {
			vector.addElement(String.valueOf(i));
		}
		//����° printStatus ȣ��		
		this.printStatus();
		
		
		vector.trimToSize();   // capacity()��  size() ������ �����ȴ�.
		//�׹�° printStatus ȣ��	
		this.printStatus();
		
		
		vector.setSize(20);
		//�ټ���° printStatus ȣ��	
		this.printStatus();
		
		System.out.println(vector.toString());
	}
	
	public void printStatus() {
		
		count++;
		System.out.println("["+count+"] capacity : "+vector.capacity()+", Element Size : "+vector.size());
	}
}
