package com.javaexamples.ch8;

/* Declare an 'enum' type constructor and explicit instance vars, with method to access those instances  */

public enum Book 
{
    // Declare enum constants, at the very begining of the enum class
    JHTP("Java How To Program", "2012"),
    CHTP("C How To Program", "2007"),
    IW3HTP("Internet & World Wide Web How To Program", "2008"),
    CPPHTP("C++ How To Program", "2012"),
    VBHTP("Visual Basic 2010 How To Program", "2011"),
    CSHARPHTP("Visual C# 2010 How to Program", "2011");

    // Instance Vars
    private final String title;
    private final String yearCopyright;

    // Enum constructor
    Book(String title, String yearCopyright)
    {
        this.title = title;
        this.yearCopyright = yearCopyright;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getYearCopyright()
    {
        return this.yearCopyright;
    }
}
