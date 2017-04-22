package net.kalman98.ld38;

public class Pos {

	int x, y;
	
	public Pos(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Pos setX(int x)
	{
		this.x = x;
		return this;
	}

	public Pos setY(int y)
	{
		this.y = y;
		return this;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
}
