package com.javaexamples.ch8;

public class Time2 
{
    private int hour;
    private int minute;
    private int second;

    // Time2 construction w/o arguments. Intilializes each var instance to zero.
    public Time2() 
    {
        this(0, 0, 0);
    }

    // Time2 constructor.
    public Time2(int h) 
    {
        this(h, 0, 0);
    }

    public Time2(int h, int m) 
    {
        this(h, m, 0);
    }

    public Time2(int h, int m, int s)
    {
        setTime(h, m, s);
    }

    // Time2 constructor: another Time2 object is input.
    public Time2(Time2 time) 
    {
        // Invoke constructor Time2 with three args
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods : set a new Universal time value
    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    } 

    // Validate and stablish hour
    public void setHour(int h) 
    {
        if (h >= 0 && h <= 24)
            hour = h;
        else
            throw new IllegalArgumentException("Hour should be from 0 to 23");
    }

    // Validate and stablish minute
    public void setMinute(int m) 
    {
        if (m >= 0 && m <= 60)
            minute = m;
        else
            throw new IllegalArgumentException("Minute should be from 0 to 60");
    }

    // Validate and stablish second
    public void setSecond(int s) 
    {
        if (s >= 0 && s <= 60)
            second = s;
        else
            throw new IllegalArgumentException("Second should be from 0 to 60");
    }

    // Get methods
    public int getHour() 
    {
        return hour;
    }

    public int getMinute() 
    {
        return minute;
    }

    public int getSecond() 
    {
        return second;
    }

    public String aStringUniversal()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
