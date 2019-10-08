package com.valmir.cursojava.aula12;

import java.util.Scanner;

public class ScanDataKeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 		 
		System.out.println("Digite seu nome completo:");
		String fullName = scan.nextLine(); // Leitura de toda a linha 
		System.out.println("Nome: " + fullName);
		
		System.out.println("Digite seu primeiro nome:");
		String firstName = scan.next(); // Leitura apenas de parte da primeira palavra da linha 
		System.out.println("Primeiro Nome: " + firstName);
	
		System.out.println ("Digite sua idade:");
		int age = scan.nextInt(); // Leitura de valores inteiros apenas.
		System.out.println ("Idade: " + age);
		
		System.out.println ("Digite sua altura:");
		double hight = scan.nextDouble(); // Leitura de valores inteiros apenas.
		System.out.println ("Altura: " + hight);
		
		*/

		System.out.println ("Digite  seu nome, sua Idade, quantidade de filhos, sua altura e ese tem pet");
		
		String name = scan.next();
		int age = scan.nextInt();
		int qntdSons = scan.nextInt();
		float hight = scan.nextFloat();
		boolean hvPet = scan.nextBoolean();
		
		System.out.println ("Dados digitatos:");
		System.out.println ("Nome: " + name);
		System.out.println ("Idade: " + age);
		System.out.println ("Quantidade de filhos: " + qntdSons);
		System.out.println ("Altura: " + hight);
		System.out.println ("Tem pet: " + hvPet);
	}

}
