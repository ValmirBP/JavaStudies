package com.valmir.cursojava.aula13;

public class CurtCircuit {

	public static void main(String[] args) {

		boolean t = true;
		boolean f = false;
		boolean result1 = f & t; // JAVA avalia as dias condições
		boolean result2 = f && t; // Curto circuito o JAVA não avalia a segunda condição 
		//devido a resposta já armazenada na em sua documentação.
		
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
