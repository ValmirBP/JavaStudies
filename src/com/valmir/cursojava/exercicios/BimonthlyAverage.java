package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class BimonthlyAverage {

	public static void main(String[] args) {
	
	//4. Fa?a um Programa que pe?a as 4 notas bimestrais e mostre a m?dia.

		double grade1;
		double grade2;
		double grade3;
		double grade4;
		double average;
		boolean aproved;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite nota do 1? BI:");
		grade1 = scan.nextDouble();
		System.out.println("nota digitada:\n" + grade1);
		
		System.out.println("digite nota do 2? BI:");
		grade2 = scan.nextDouble();
		System.out.println("nota digitada:\n" + grade2);
		
		System.out.println("digite nota do 3? BI:");
		grade3 = scan.nextDouble();
		System.out.println("nota digitada:\n" + grade3);
		
		System.out.println("digite nota do 4? BI:\n");
		grade4 = scan.nextDouble();
		System.out.println("nota digitada:\n" + grade4);
		
		average = (grade1+grade2+grade3+grade4)/4;
		
		System.out.println("\nA m?da ?:");
		System.out.println(average);
		
		if(average >= 7.0) {
			System.out.println("Aprovado");			
		}else {
			System.out.println("Reprovado");
		}
		
		
	}

}
