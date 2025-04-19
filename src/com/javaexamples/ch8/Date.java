package com.javaexamples.ch8;

/* Declaration of Date class */

public class Date 
{
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int m, int d, int y) 
    {
        month = validateMonth(m);
        year = y;
        day = validateDay(d);

        System.out.printf("Constructior of an object Date for the date %s\n", this);
    }

    // Utility method to validate the proper valur for month
    private int validateMonth(int m)
    {
        if (m > 0 && m <= 12)
            return m;
        else
            throw new IllegalArgumentException("Month should be btw 1 to 12");
    } 

    private int validateDay(int d)
    {
        if (d > 0 && d <= daysPerMonth[month])
            return d;

        if (month == 2 && d == 29 && (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)))
            return d;

        throw new IllegalArgumentException("Day should be btw 1 to ");
    }

    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
