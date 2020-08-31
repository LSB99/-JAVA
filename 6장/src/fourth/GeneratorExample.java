package fourth;

public class GeneratorExample {

	public static void main(String[] args) {
		
		ServiceGenerator svc = new ServiceGenerator();
		SystemGenerator sys = new SystemGenerator();
		
		String svcName = svc.getClass().getSimpleName();
		
		if(svc instanceof GeneratorInterface)
			System.out.println(svcName+"은 GeneratorInterface의 인스턴스");
		
		else
			System.out.println(svcName+"은 GeneratorInterface의 인스턴스가 아니다.");
		
		
		if(svc instanceof ServiceGenerator)
			System.out.println(svcName+"은 ServiceGenerator의 인스턴스");
		
		else
			System.out.println(svcName+"은 ServiceGenerator의 인스턴스가 아니다.");
		
		
		
		String sysName = sys.getClass().getSimpleName();
		
		
		if(sys instanceof GeneratorInterface)
			System.out.println(sysName+"은 GeneratorInterface의 인스턴스");
		
		else
			System.out.println(sysName+"은 GeneratorInterface의 인스턴스가 아니다.");
		
		
		if(sys instanceof SystemGenerator)
			System.out.println(sysName+"은 SystemGenerator의 인스턴스");
		
		else
			System.out.println(sysName+"은 SystemGenerator의 인스턴스가 아니다.");
		
		
		GeneratorInterface genIf1 = (GeneratorInterface) sys;
		GeneratorInterface genIf2 = (GeneratorInterface) svc;
 		
	}
}
