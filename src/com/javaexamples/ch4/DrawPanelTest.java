package com.javaexamples.ch4;  // Creating JFrame to display DrawPanel

import javax.swing.JFrame;

public class DrawPanelTest 
{
	public static void main(String[] args)
	{
		// creates a panel that contains our drawing
		DrawPanel panel = new DrawPanel();
		
		// create a new frame (app) to hold and display the panel
		JFrame applicaton = new JFrame();
		
		// set the frame (app) to exit when it is closed
		applicaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		applicaton.add(panel);  // add the panel to the frame
		
		applicaton.setSize(250, 250);  // set the size of the frame
		
		applicaton.setVisible(true);  // make the frame visible
	}
}
