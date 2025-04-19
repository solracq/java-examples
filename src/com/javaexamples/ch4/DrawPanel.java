package com.javaexamples.ch4;  // Application using drawLine to connect the corners of a panel.

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel // "extends" indicates the class DrawPanel is an enhanced type or JPanel.
{                                     // Inheritance relationship, where DrawPanel class start using the data/methods of JPanel class.
	                                 // DrawPanel = SubClass / JPanel = SuperClass
	private static final long serialVersionUID = 1L;

	// JPanel class needs a paintComponent method that the system will call everytime it needs to display a DrawPanel (e.g. resizing the window), 
	// this draws an X from the corners of the panel.
	public void paintComponent(Graphics g) // The graphics object "g" is used to draw lines, rectangles, ovals and other graphics.
	{
		// First statement for every paintComponent method. This call paintComponent to ensure the panel displays correctly before drawing. 
		super.paintComponent(g);
		
		int width = getWidth(); // Returns the JPanel's total width
		int height = getHeight(); // Returns the JPanel's total height
		
		// draw a line from the upper-left to the lower-right
		for (int i = 0 ; i <= width ; i += width/15)
		{
			//g.drawLine(0, 0, width / 2, height / 2);
			g.drawLine(0, 0, (width / 15) + i, height - (height / 15) - i);
			
			//draw a line from the lower-left to the upper-right
			//g.drawLine(0, height, width, 0);
			g.drawLine(0, height - (height / 15) - i, (width / 15) + i, 0);
			//g.drawLine((width / 15) + i, 0, 0, height - (height / 15) - i);
			g.drawLine((width / 15) - i, height - (height / 15) + i, 0, 0);
		}
		
		//g.drawOval(1, 1, width, height);
	} 
} // end class DrawPanel
