package com.javaexamples.ch3;

import javax.swing.JOptionPane;

public class DateTest {
	
	public static void main(String[] args)
	{
		Date date = new Date(03, 10, 1983);
		//Date dateInvalid = new Date(1, 8, 1970);
		
		int day = date.getDay();
		int month = date.getMonth();
		int year = date.getYear();
		
		JOptionPane.showMessageDialog(null, date.displayDate(day, month, year));
		
		date.setDay(19);
		date.setMonth(8);
		date.setYear(1977);
		
		JOptionPane.showMessageDialog(null, date.displayDate(date.getDay(), date.getMonth(), date.getYear()));
	}

}
