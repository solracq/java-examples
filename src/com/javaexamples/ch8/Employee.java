package com.javaexamples.ch8;

public class Employee 
{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hiringDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hiringDate) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hiringDate = hiringDate;
    }

    public String toString()
    {
        return String.format("%s, %s Hired: %s BirthDay: %s", this.lastName, this.firstName, hiringDate, birthDate);
    }
}
