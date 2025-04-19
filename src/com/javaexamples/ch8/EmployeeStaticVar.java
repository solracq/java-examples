package com.javaexamples.ch8;

/* Static variable used to mantain a num counter of Employee objects in the memory. */

public class EmployeeStaticVar 
{
    private String firstName;
    private String lastName;
    private static int count;
    
    public EmployeeStaticVar(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        count++;
        System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public static int getCount()
    {
        return count;
    }
}
