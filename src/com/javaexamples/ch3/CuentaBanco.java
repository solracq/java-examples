package com.javaexamples.ch3;

public class CuentaBanco {
	private double cuenta;
	
	public CuentaBanco(double cuenta){
		if (cuenta >=0)
			this.cuenta = cuenta;
	}
	
	public void deposit(double cuenta){
		this.cuenta = cuenta;
	}
	
	public double saldoCuenta(){
		return cuenta;
	}
	
	public void printCuenta(int num){
		System.out.printf("Saldo de cuenta %s : %.2f%n%n", num, saldoCuenta());
	}
}