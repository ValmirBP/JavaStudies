package com.valmir.cursojava.aula13;

public class LogicOperator {

	public static void main(String[] args) {

		int value1 = 1;
		int value2 = 2;
		
		
		boolean result1 = (value1 == 1 ) && (value2 == 2); 
		System.out.println("Valor1 é 1 AND Valor2 é 2 - resultado: " + result1 );
		
		boolean result2 = (value1 == 1 ) || (value2 == 2); 
		System.out.println("Valor1 é 1 OR Valor2 é 2 - resultado:  " + result2 );
		
		boolean t = true;
		boolean f = false;
		
		System.out.println( t && f);
		System.out.println( t || f);
		System.out.println( t ^ f);
		System.out.println( !t && f);
		
		

	}

}
