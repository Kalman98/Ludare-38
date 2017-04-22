package net.kalman98.ld38;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Game implements ActionListener
{

	Window window = new Window();
	Timer timer;
	
	public Game()
	{	
		window.add(new Sprite().setPos(new Pos(500, 50)).setImage("src/main/resources/aoeutelomatic.png"));
		
		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		window.revalidate();
		window.repaint();
		System.out.println("Finished painteying.");
	}
	
}
