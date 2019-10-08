package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class SumOfTwoNumbers {

		public static void main(String[] args) {
			
			//3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
			
			double num1;
			double num2;
			double result;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Digite o primeiro N�mero: ...\n");
			num1 = scan.nextDouble();
			
			System.out.print("Numero digitado:\t" + num1);
			System.out.print("\nArmazenado com sucesso...\n\n");
			
			System.out.print("Digite o segundo N�mero: ...\n");
			num2 = scan.nextDouble();
			
			System.out.print("Numero digitado: \n\n" + num2);
			System.out.print("\nArmazenado com sucesso ...\n\n");
			System.out.print("Calculando a soma...\n\n");
		
			result = num1 + num2;
			
			System.out.print("A soma entre os n�meros �:\n");
			System.out.print(result);
	}
}
