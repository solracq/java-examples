package com.javaexamples.ch8;

/* Compile a java class with package to generate a compiled class file of the class:
 * javac -d . Time1.java
 * 
 */

public class Time1 {
    private int hour;
    private int minute;
    private int second;
    
    public void stablishTime(int h, int m, int s) {
        if ((h >= 0 && h <= 24) && (m >= 0 && m <= 60) && (s >= 0 && s <= 60)) {
            hour = h;
            minute = m;
            second = s;
        } 
        else {
            throw new IllegalArgumentException("hour, minute and/or secund are out of range");
        }
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0) || hour == 12) ? 12 : hour % 12, minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
