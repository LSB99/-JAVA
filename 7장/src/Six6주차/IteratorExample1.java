package Six6ÁÖÂ÷;

import java.util.*;

public class IteratorExample1 {
	
	private ArrayList<String> urlList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		
		IteratorExample1 example = new IteratorExample1();
		
		example.init();
		example.execute();
	}
	
	public void init() {
		
		urlList.add("http://www.daum.net");
		urlList.add("http://www.google.co.kr");
		urlList.add("http://www.facebook.com");
		
	}
	
	public void execute() {
		
		for(int i=0; i<urlList.size(); i++) {
			System.out.println("URL : "+urlList.get(i));
		}
		
		System.out.println("--------------------------------");
		
		
		for(String url : urlList) {
			System.out.println("URL : "+ url);
		}
		
		System.out.println("--------------------------------");
		
		Iterator<String> iter = urlList.iterator();
		
		while(iter.hasNext()) {
			System.out.println("URL : "+ (String)iter.next());
		}
	}
}
