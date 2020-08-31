package fourth;

public class InnerClassExample2 {
	
	public static void main(String[] args) {
		
		InnerClass innerclass = new InnerClassExample2.InnerClass();
		
		System.out.println("keyworld : "+InnerClass.keyword);
		innerclass.printInfo();
		innerclass.printName();
	
		InnerClass.printName();
	}
	
	static class InnerClass{  // 정적 클래스
		
		static String keyword = "STATIC INNER CLASS";
		
		public void printInfo() {
			System.out.println("You called printInfo method");
		}
		
		public static void printName() {
			System.out.println("You called printName method");
		}
	}

}
