// ecuación diofantina x3+y3+z3=k
// This program proves the following: 
// 42 = (-80538738812075974)^3 + 80435758145817515^3 + 12602123297335631^3

package com.javaexamples.ch2;

public class EcuacionDiofantina {
	public static void main(String[] args){
		// z = 12602123297335631
		long x = -80538738812075974L;
		long y = 80435758145817515L;
		long z = 12602123297335631L;
		
		long k = (x*x*x)+(y*y*y)+(z*z*z);
		
		System.out.println("Ecuación Diofantina x3+y3+z3=k");
		System.out.printf("%n(%s)^3 + (%s)^3 + (%s)^3", x, y, z);
		System.out.printf("%n%s + %s + %s = %s", x*x*x, y*y*y, z*z*z, k);
	}
}
