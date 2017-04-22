package net.kalman98.ld38;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Game implements ActionListener
{

	Window window = new Window();
	Timer maintimer;
	Timer gfxtimer;
	public Game()
	{	
		window.add(new Sprite().setPos(new Pos(500, 50)).setImage("telomatic.png"));
		
		maintimer = new Timer(10, this);
		maintimer.start();
	
		gfxtimer = new Timer(5, window);
		gfxtimer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		window.add(new Sprite().setPos(new Pos(500, 50)).setImage("telomatic.png"));
	}
	
}
