package com.javaexamples.ch4;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraLimiteCredito {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String usuario = null;
		int noCuenta = 0;
		int saldoInicial;
		int totalCargos = 0;
		int totalCreditoAplicado = 0;
		int creditoLimite = 7000;
		int saldo = 0;
		int contador = 0;
		
		System.out.printf("%n%s%s%s%n", "Dame el nombre del usuario no.", contador+1, " (para salir \"stop\")");
		usuario = input.nextLine();
		
		System.out.printf("%s%s", "== usuario ==", usuario);
		while (usuario != "stop"){
			contador++;
			noCuenta = rand.nextInt(500001);
			System.out.printf("%s%s%n", "Numero de cuenta asignado : ", noCuenta);
			System.out.printf("%s%s%n", "Su saldo inicial es de $", saldoInicial = rand.nextInt(5500));
			System.out.printf("%s%s%n", "El total de sus cargos (gastos) en este mes fue de : $", totalCargos = rand.nextInt(20001));
			totalCreditoAplicado = creditoApplicado(saldoInicial, totalCargos);
			System.out.printf("%s%s%n", "El credito gastado fue de $", totalCreditoAplicado);
			saldo = saldoInicial + totalCargos - totalCreditoAplicado;
			System.out.printf("%s%s%n", "El Saldo final es de $", saldo);
			
			if (saldo > creditoLimite)
			System.out.printf("%n%s%n", "Se excedio del limite de credito!");
			
			System.out.printf("%n%s%s%n", "Dame el nombre del usuario no.", contador+1, " (para salir \"stop\")");
			usuario = input.nextLine();
		}
		
		input.close();
	}
	
	public static int creditoApplicado(int saldoInicial_, int totalCargos_){
		int credito = 0;
		
		if (totalCargos_ > saldoInicial_){
			credito = totalCargos_ - saldoInicial_;
		}
		
		return credito;
	}
}
