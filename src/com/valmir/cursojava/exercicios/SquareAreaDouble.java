package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class SquareAreaDouble {
	
public static void main (String [] args) {
	
	//Fa�a um Programa que calcule a �rea de um quadrado, em seguida
	//mostre o dobro desta �rea para o usu�rio.
	
	double base; 
	double area;
	double sqd;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println ("Digite a base do quadrado");
	base= s.nextDouble();
	
	area = base * base;
	
	System.out.println (" �rea = " + area);
	
	sqd = area*area;
	
	System.out.println (" Quadrado da �rea = " + sqd);
	

	}
}