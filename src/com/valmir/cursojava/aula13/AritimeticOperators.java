package com.valmir.cursojava.aula13;

public class AritimeticOperators {

	public static void main (String[] args) {

		int result = 1+2;
		
		result = result -1;
		System.out.println(result);
		
		result = result *2;
		System.out.println(result);
		
		result = result /2;
		System.out.println(result);
		
		result = result +8;
		System.out.println(result);
		
		result = result % 7 ;
		System.out.println(result);
		
		String name1 = "Esta é ";
		String name2 = "uma String concatenada";
		String name3 = name1 + name2;
		System.out.println(name3);
		
		result = result +1 ;
		System.out.println(result);
		
		result++;
		System.out.println(result);
		
		//5
		System.out.println(result++);
		// mesma coisa que
		//System.out.println(result);
		//result = result + 1;
		//result += 1; 
		// mostro primeiro depois somo

		
		System.out.println(++result);
		// mesma  coisa que
		// result +=1
		//System.out.println(result);
		// ou seja somo primeir depois mostro
		
		result--;
		System.out.println(result);
		
		System.out.println(result--);
		System.out.println(--result);
		
		// mesma explicação anterior.
		
		
		
		}
	}
