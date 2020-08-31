package chap5;

import java.awt.Color;

public class p151 {
	
	private Color color;
	private float thickness;
	
	public p151() {
		color = new Color(0,0,0);
		thickness = 2.0F;
	}
	
	public void drawLine() 
	{
		System.out.println("----------");
	}
	
	public void drawDot() 
	{
		System.out.println("..........");
	}
	
	public static void main(String[] args)
	{
		p151 p = new p151();
		
		p.drawLine();
		p.drawDot();
	}

}
