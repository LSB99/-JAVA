package p1;

import java.util.*;
public class OverridingChild extends OverridingParent{
	
	public static void main(String[] args) {
		
		OverridingParent parent = new OverridingParent();
		OverridingChild child = new OverridingChild();
		
		System.out.println("Now Date : "+ parent.getDate());
		System.out.println("Now Date : "+child.getDate());
	}
	
	public String getDate() {
		Date date = new Date();
		String[] items = date.toString().split(" ");
		String msg = "YEAR = "+items[5];
		msg += ", Month = "+items[1];
		msg += ", Day = "+items[2];
		
		return msg;
	}

}
