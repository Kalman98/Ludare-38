package net.kalman98.ld38;

import java.awt.Graphics2D;

public class Renderer {

	public static Graphics2D g2d = null;
	
	
	public static void drawSprite(Sprite s)
	{
		System.out.println("Rendering that one image.");
    	g2d.drawImage(s.getImage(), s.getX(), s.getY(), null);
	}
	
	public static void setG2D(Graphics2D g)
	{
		g2d = g;
	}
}
