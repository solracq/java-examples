package com.javaexamples.ch8;

public class Time2Test 
{
    public static void main(String[] args) 
    {
        Time2 time1 = new Time2();
        Time2 time2 = new Time2(2);
        Time2 time3 = new Time2(21, 34);
        Time2 time4 = new Time2(12, 25, 42);
        Time2 time5 = new Time2(time4);

        System.out.println("Constructed w/ :");
        System.out.println("time1 : All the predetermined arguments");
        System.out.printf(" %s\n", time1.aStringUniversal());
        System.out.printf(" %s\n", time1.toString());

        System.out.println("time2 : All the predetermined arguments");
        System.out.printf(" %s\n", time2.aStringUniversal());
        System.out.printf(" %s\n", time2.toString());

        System.out.println("time3 : All the predetermined arguments");
        System.out.printf(" %s\n", time3.aStringUniversal());
        System.out.printf(" %s\n", time3.toString());

        System.out.println("time4 : All the predetermined arguments");
        System.out.printf(" %s\n", time4.aStringUniversal());
        System.out.printf(" %s\n", time4.toString());

        System.out.println("time5 : All the predetermined arguments");
        System.out.printf(" %s\n", time5.aStringUniversal());
        System.out.printf(" %s\n", time5.toString());

        try
        {
            Time2 time6 = new Time2(27, 74, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("\nExepiton when initializing obj time6: %s\n", e.getMessage());
        }
    }
}
