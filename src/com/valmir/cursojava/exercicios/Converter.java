package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// 5. Fa�a um Programa que converta metros para cent�metros.
		
		double centimeters;
		double convertion;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CONVERSOR DE cm PARA m\n\n");
		System.out.println("Digite a medida em cm");
	
		centimeters = scan.nextDouble();
		
		System.out.println("Convertendo\n\n");
		
		convertion = centimeters/100;
		
		System.out.println(centimeters + " Cemt�metros equivale a " + convertion + " Metros." );
	}

}
