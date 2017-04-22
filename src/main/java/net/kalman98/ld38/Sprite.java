package net.kalman98.ld38;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Sprite {

	Image image;
	Pos pos;
	
	public Sprite()
	{
		this.setPos(Window.CENTER);
	}
	
	public void render()
	{
		Renderer.drawSprite(this);
	}
	
	public Sprite setImage(String loc)
	{	
		this.image = new ImageIcon(loc).getImage();
		return this;
	}
	
	public Image getImage()
	{
		return this.image;
	}
	public Sprite setX(int x)
	{
		this.pos.setX(x);
		return this;
	}
	
	public Sprite setY(int y)
	{
		this.pos.setY(y);
		return this;
	}
	
	public int getX()
	{
		return this.getPos().getX();
	}
	
	public int getY()
	{
		return this.getPos().getY();
	}
	
	public Sprite setPos(int x, int y)
	{
		this.setX(x);
		this.setY(y);
		return this;
	}
	
	public Sprite setPos(Pos pos)
	{
		this.pos = pos;
		return this;
	}
	
	public Pos getPos()
	{
		return this.pos;
	}
}
