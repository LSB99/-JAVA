package fourth;

public class InnerClassExample1 {
	
	private int outerHashCode;
	public String outerClassName;
	static boolean isOuter;
	
	public InnerClassExample1() {
		outerHashCode = System.identityHashCode(this);
		outerClassName = this.getClass().getName();
		isOuter = true;
	}
	
	class InnerClass{
		
		private int innerHashCode;
		public String innerClassName;
		
		static final boolean isInner = true;
		
		public InnerClass() {
			innerHashCode = System.identityHashCode(this);
			innerClassName = this.getClass().getName();
		}
		
		public void printOuterInfo() {
			System.out.println("Outer object hashcode : "+outerHashCode);
			System.out.println("Outer object class name : "+outerClassName);
			System.out.println("Is it outer class : "+isOuter);
		}
		
		public void printInnerInfo() {
			System.out.println("Inner object hashcode : "+this.innerHashCode);
			System.out.println("Inner object class name : "+this.innerClassName);
			System.out.println("Is it inner class : "+isInner);
		}
	}
	
	public static void main(String[] args) {
		
		InnerClassExample1 example = new InnerClassExample1();   //외부클래스 인스턴스 생성
		InnerClass innerExample = example.new InnerClass();  //내부클래스 인스턴스 생성
		
		innerExample.printInnerInfo();
		System.out.println("-----------------");
		innerExample.printOuterInfo();
	}
}
