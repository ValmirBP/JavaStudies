package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class CircleArea {
	
	public static void main (String[] args) {
		
		//6. Fa?a um Programa que pe?a o raio de um c?rculo, calcule e mostre
		//sua ?rea.
		
		double ray;
		double vol;
		double area;
		double hight;
		double pi = 3.1415926535897932384626433832795;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um o raio do circulo medido");
		ray = s.nextDouble();
		System.out.println("Calculando ?rea ...\n");
		
		area = pi*(ray*ray);
		
		System.out.println("?rea = " + area);
		
		System.out.println("\nDigite a altura: ");
		hight= s.nextDouble();
		System.out.println("\nCalculando Volume ...\n");
		
		vol = area * hight;
		
		System.out.println(" Volume = "+ vol);	
	}

}
