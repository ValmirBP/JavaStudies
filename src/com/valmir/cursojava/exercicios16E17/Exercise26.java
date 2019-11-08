package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise26 {
    /*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
o Fatorial de: 5
o 5! = 5 . 4 . 3 . 2 . 1 = 120
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num, result, fatorial = 1;

        System.out.println("digite um numero para ser calculado o fatorial");
        num = s.nextInt();

        System.out.println("Fatorial de " + num + " \n");

        System.out.print(num + "! = ");

        for (int i = num; i > 1; i--) {

            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.println(" 1 = " + fatorial);
    }
}
