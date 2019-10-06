/**
 * 
 *  @see : Test dialgo
 *  @author : Carlos Quiroz
 *  @since : October 10th 2015
 *  @serial : Exercise : Dialogo.java
 * 
 */

package com.javaexamples.ch3;

import javax.swing.JOptionPane;;

public class Dialogo {
	
	public static void main(String[] args)
	{
		String showQuestion = JOptionPane.showInputDialog("Yu me pertenece?");  // Question dialog will show regardless of being assigned to a var
		
		String questionAndMessage = String.format("%s, Yu es mia!", showQuestion);
		
		JOptionPane.showMessageDialog(null, questionAndMessage);
	}

}
