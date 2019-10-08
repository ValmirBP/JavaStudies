package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

public class Exercise03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String value1 = s.next();

        if (value1.equalsIgnoreCase("f")) {
            System.out.println("" + value1 + "eminino");
        } else if (value1.equalsIgnoreCase("m")) {
            System.out.println("" + value1 + "asculino");
        } else {
            System.out.println("valor inválido letras aceias são M ou F ");
        }
    }
}
