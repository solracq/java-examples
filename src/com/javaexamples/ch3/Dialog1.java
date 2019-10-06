/**
 * 
 *  @see : Using JOptionPane to display multiple line in a dialog box.
 *  @author : Carlos Quiroz
 *  @since : October 5th 2015
 *  @serial : 3.12 : Dialog1.java
 * 
 */

package com.javaexamples.ch3;

import javax.swing.JOptionPane;

public class Dialog1 {

	public static void main(String[] args)
	{
		// Display a dialog with a message
		JOptionPane.showMessageDialog(null, "Hola Carlo Eduardo");
		JOptionPane.showConfirmDialog(null, "Continue?");
		                           //   ^--- Parent Window
	}
}
