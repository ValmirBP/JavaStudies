package com.valmir.cursojava.aula10;

public class Varables {

	public static void main(String[] args) {
		
		// Convenção JAVA
		int age = 25;
		String name = "Valmir";
		String nameOfTheDog = "Panqueca";
		
		//Aceito, porém não utilizado
		int _age;
		int $age;
		
		// Não é convenção JAVA
		String name_of_the_dog;
		String NamoOfMyDog;
		String NameOfMyDog;
		
		//Má prática
		int a = 10;
		String b = "Valmir";
		
	System.out.println("Age = " + age );
	System.out.println("Name = " + name );
	System.out.println("Name of the pet = " + nameOfTheDog );

	}

}
