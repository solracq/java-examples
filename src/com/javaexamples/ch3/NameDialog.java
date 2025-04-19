/**
 * 
 *  @see : Obtaining user input from a dialog
 *  @author : Carlos Q
 *  @serial : 3.13 : NameDialog.java
 * 
 */

package com.javaexamples.ch3;

import javax.swing.JOptionPane;

public class NameDialog {
	
	public static void main(String[] args)
	{
		// Prompt user to enter name
		String name = JOptionPane.showInputDialog("What is your name");
		
		// Create the message
		String message = String.format("Welcome %s to Java Programming", name);
		
		// Display the message to welcome user by name
		JOptionPane.showMessageDialog(null, message);
	}

}
