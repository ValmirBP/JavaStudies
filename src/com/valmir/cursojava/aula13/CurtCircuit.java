package com.valmir.cursojava.aula13;

public class CurtCircuit {

	public static void main(String[] args) {

		boolean t = true;
		boolean f = false;
		boolean result1 = f & t; // JAVA avalia as dias condi��es
		boolean result2 = f && t; // Curto circuito o JAVA n�o avalia a segunda condi��o 
		//devido a resposta j� armazenada na em sua documenta��o.
		
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
