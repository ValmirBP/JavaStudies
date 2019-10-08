package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class ReadingNumber {

	public static void main(String[] args) {

		// 2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a
		//mensagem O n�mero informado foi [n�mero].
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite um n�mero");
		double number = scan.nextDouble();
		System.out.println("Seu n�mero digitado foi: " + number);
	}
}