package fourth;

public class GeneratorExample {

	public static void main(String[] args) {
		
		ServiceGenerator svc = new ServiceGenerator();
		SystemGenerator sys = new SystemGenerator();
		
		String svcName = svc.getClass().getSimpleName();
		
		if(svc instanceof GeneratorInterface)
			System.out.println(svcName+"�� GeneratorInterface�� �ν��Ͻ�");
		
		else
			System.out.println(svcName+"�� GeneratorInterface�� �ν��Ͻ��� �ƴϴ�.");
		
		
		if(svc instanceof ServiceGenerator)
			System.out.println(svcName+"�� ServiceGenerator�� �ν��Ͻ�");
		
		else
			System.out.println(svcName+"�� ServiceGenerator�� �ν��Ͻ��� �ƴϴ�.");
		
		
		
		String sysName = sys.getClass().getSimpleName();
		
		
		if(sys instanceof GeneratorInterface)
			System.out.println(sysName+"�� GeneratorInterface�� �ν��Ͻ�");
		
		else
			System.out.println(sysName+"�� GeneratorInterface�� �ν��Ͻ��� �ƴϴ�.");
		
		
		if(sys instanceof SystemGenerator)
			System.out.println(sysName+"�� SystemGenerator�� �ν��Ͻ�");
		
		else
			System.out.println(sysName+"�� SystemGenerator�� �ν��Ͻ��� �ƴϴ�.");
		
		
		GeneratorInterface genIf1 = (GeneratorInterface) sys;
		GeneratorInterface genIf2 = (GeneratorInterface) svc;
 		
	}
}
