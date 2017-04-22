package net.kalman98.ld38;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Window extends JPanel
{	
	final static int WIDTH = 768;
	final static int HEIGHT = 432;
	final static Pos CENTER = new Pos(WIDTH/2, HEIGHT/2);
	
	public ArrayList<Sprite> sprites;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame myFrame;
	
	public Window()
	{
		myFrame = new JFrame("Ludare 38");
        myFrame.setSize(768, 432);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
	}
	
	@Override
    public void paint(Graphics g)
	{
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        for (int i = 0; i < this.sprites.size(); i++)
        {
        	Sprite s = this.sprites.get(i);
        	g2d.drawImage(s.getImage(), s.getX(), s.getY(), null);
        }
    }
	
	public void add(Sprite sprite)
	{
		this.sprites.add(sprite);
	}
}
