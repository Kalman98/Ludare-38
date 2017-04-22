package net.kalman98.ld38;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Window extends JPanel implements ActionListener
{	
	final static int WIDTH = 768;
	final static int HEIGHT = 432;
	final static Pos CENTER = new Pos(WIDTH/2, HEIGHT/2);
	
	public ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame mainFrame;
	
	public Window()
	{
		mainFrame = new JFrame("Ludare 38");
        mainFrame.setSize(768, 432);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
        this.setOpaque(true);
        mainFrame.setContentPane(this);
	}
	
	@Override
    public void paint(Graphics g)
	{
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // this is the big moment - where Renderer gets its Graphics2D object, and all consecutive rendering occurs
        Renderer.setG2D(g2d);
        
        for (int i = 0; i < this.sprites.size(); i++)
        {
        	this.sprites.get(i).render();
        }
    }
	
	public void add(Sprite sprite)
	{
		this.sprites.add(sprite);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		this.revalidate();
		this.repaint();
	}
}
