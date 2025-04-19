package com.javaexamples.ch6;

public class StaticAndNonStaticMethods {
    public static void main(String[] args) {
        //StaticAndNonStaticMethods.noStaticMethod(); // Attempting to call a non-static method from a static method
        //noStaticMethod2(); // This will not compile.
        staticMethod(); // This will compile - calling a static method from a static method
    }

    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public void noStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public void noStaticMethod2() {
        System.out.println("This is a non-static method");
        noStaticMethod(); // This will compile - calling a non-static method from a non-static method
        staticMethod();  // This will compile - calling a static method from a non-static method
    }
}
