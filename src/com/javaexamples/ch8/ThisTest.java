package com.javaexamples.ch8;

/* Implicit and Explicit use of 'this' to refer members in an object.
 * 
 * NOTE: Al compilar un archivo '.java' que contiene mas de una clase, el compilador produce un archivo de clase separado
 * con la extension '.class' para cada clase compilada.
 * 
 * Un archive de codige fuento solo puede contener una clase 'public'; de lo contratio, se produce un error de compliacion.
  */

public class ThisTest {
    public static void main(String[] args) {
      SimpleTime time = new SimpleTime(15, 30, 19);
      System.out.println(time.createString());
    }
}

class SimpleTime {
    private int hour;
    private int minute;
    private int second;
    
    public SimpleTime(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }

    // Uses the explicit and implicet reference 'this' to call the 'aStringUniversal' method.
    public String createString() {
      return String.format("%24s: %s\n%24s: %s", "this.aStringUniversal()", this.aStringUniversal(), "aStringUniversal()", aStringUniversal());
    }

    // Convert String to Uneversal time format (HH:MM:SS)
    public String aStringUniversal() {
      // 'this' is not required to access instance variables here, because the method doesn't have local variables with the same names as the instance variables.
      return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
