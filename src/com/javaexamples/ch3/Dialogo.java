/**
 * 
 *  @see : Test dialgo
 *  @author : Carlos Q
 *  @serial : Exercise : Dialogo.java
 * 
 */

package com.javaexamples.ch3;

import javax.swing.JOptionPane;;

public class Dialogo {
	
	public static void main(String[] args)
	{
		String showQuestion = JOptionPane.showInputDialog("Yya pertenece?");  // Question dialog will show regardless of being assigned to a var
		
		String questionAndMessage = String.format("%s, Yi is good!", showQuestion);
		
		JOptionPane.showMessageDialog(null, questionAndMessage);
	}

}
