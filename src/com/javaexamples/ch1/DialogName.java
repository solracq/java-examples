package com.javaexamples.ch1;

/** BAsic input w/ dialog window */

import javax.swing.JOptionPane;

public class DialogName {
    public static void main( String[] args ) {
        String name = JOptionPane.showInputDialog(null, "What is your name", "Name Input Window", 0);

        String message = String.format("Welcome, %s, to Java programming!", name);

        JOptionPane.showMessageDialog(null, message, "Message Window", 0);
    }
}
